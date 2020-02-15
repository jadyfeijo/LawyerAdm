package com.gfadvocaciars.lawyeradm.services;

import com.gfadvocaciars.lawyeradm.domain.Process;
import com.gfadvocaciars.lawyeradm.repositories.ProcessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessService {

    @Autowired
    private ProcessRepository repository;

    public List<Process> findAll(){
        return repository.findAll();
    }
}
