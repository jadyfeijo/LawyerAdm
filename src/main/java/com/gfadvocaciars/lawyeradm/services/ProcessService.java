package com.gfadvocaciars.lawyeradm.services;

import com.gfadvocaciars.lawyeradm.domain.Process;
import com.gfadvocaciars.lawyeradm.exceptions.NotFoundException;
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

    public Process findById(String processId){
        Process process = repository.findById(processId).orElseThrow(()->new NotFoundException("Process not found"));
        return process;
    }

    public Process create(Process process) {
        return repository.save(process);
    }

    public Process update(Process updatedProcess, String processId){
        Process process = findById(processId);
        updatedProcess.setId(process.getId());

        return repository.save(updatedProcess);
    }

}
