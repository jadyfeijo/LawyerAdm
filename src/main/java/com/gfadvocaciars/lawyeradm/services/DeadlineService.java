package com.gfadvocaciars.lawyeradm.services;

import com.gfadvocaciars.lawyeradm.domain.Deadline;
import com.gfadvocaciars.lawyeradm.repositories.DeadlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeadlineService {

    @Autowired
    private DeadlineRepository repo;

    public List<Deadline> findAll(){
        return repo.findAll();
    }

    public Deadline create(Deadline deadline) {
        return repo.save(deadline);
    }
}
