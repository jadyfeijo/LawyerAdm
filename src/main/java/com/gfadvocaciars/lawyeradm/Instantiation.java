package com.gfadvocaciars.lawyeradm;

import com.gfadvocaciars.lawyeradm.domain.Deadline;
import com.gfadvocaciars.lawyeradm.domain.Employee;
import com.gfadvocaciars.lawyeradm.domain.Lawyer;
import com.gfadvocaciars.lawyeradm.domain.Process;
import com.gfadvocaciars.lawyeradm.repositories.DeadlineRepository;
import com.gfadvocaciars.lawyeradm.repositories.EmployeeRepository;
import com.gfadvocaciars.lawyeradm.repositories.ProcessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private ProcessRepository processRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DeadlineRepository deadlineRepository;
    @Override
    public void run(String... args) throws Exception {

        Process proc = new Process();
        proc.setNumber("123545");

        Lawyer lw = new Lawyer();
        lw.setOab("75501");
     //   processRepository.save(proc);
       // employeeRepository.save(lw);
       // deadlineRepository.save(new Deadline());
    }
}
