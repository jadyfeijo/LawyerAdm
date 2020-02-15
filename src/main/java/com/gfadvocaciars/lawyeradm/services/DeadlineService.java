package com.gfadvocaciars.lawyeradm.services;

import com.gfadvocaciars.lawyeradm.domain.Deadline;
import com.gfadvocaciars.lawyeradm.domain.enums.DeadlineStatus;
import com.gfadvocaciars.lawyeradm.exceptions.NotFoundException;
import com.gfadvocaciars.lawyeradm.repositories.DeadlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@Service
public class DeadlineService {

    @Autowired
    private DeadlineRepository repo;

    public List<Deadline> findAll() {
        return repo.findAll();
    }

    public Deadline findById(String deadlineId){
        Deadline deadline = repo.findById(deadlineId).orElseThrow(()->new NotFoundException("Deadline not found"));
        return deadline;
    }

    public Deadline create(Deadline deadline) {
        int daysToEnd;
        if (deadline.getDeadline() != null) {
            daysToEnd = deadline.getDeadline();
        } else {
            daysToEnd = deadline.getType().getDaysOfDeadline();
        }
        deadline.setFinalDate(calculateBusinessDayDeadline(deadline.getInitialDate(), daysToEnd));
        deadline.setStatus(DeadlineStatus.ANDAMENTO);
        return repo.save(deadline);
    }

    public Deadline upadate(String deadlineId, Deadline updatedDeadline){
        Deadline deadline = findById(deadlineId);

        deadline.setType(updatedDeadline.getType());
        deadline.setStatus(updatedDeadline.getStatus());
        deadline.setDescription(updatedDeadline.getDescription());
        deadline.setDeadline(updatedDeadline.getDeadline());
        deadline.setInitialDate(updatedDeadline.getInitialDate());
        deadline.setFinalDate(updatedDeadline.getFinalDate());
        deadline.setProcess(updatedDeadline.getProcess());
        deadline.setMaker(updatedDeadline.getMaker());

        return repo.save(deadline);
    }

    private Date calculateBusinessDayDeadline(Date initialDate, int deadline) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(initialDate);
        calendar.setTimeZone(TimeZone.getDefault());

        for (int i = 0; i < deadline; i++) {

            switch (calendar.get(Calendar.DAY_OF_WEEK)) {
                case Calendar.FRIDAY:
                    calendar.add(Calendar.DAY_OF_WEEK, 3);
                    break;

                case Calendar.SATURDAY:
                    calendar.add(Calendar.DAY_OF_WEEK, 2);
                    break;

                default:
                    calendar.add(Calendar.DAY_OF_WEEK, 1);
            }
        }
        return calendar.getTime();
    }
}
