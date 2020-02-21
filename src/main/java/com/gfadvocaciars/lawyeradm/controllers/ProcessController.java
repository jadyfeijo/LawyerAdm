package com.gfadvocaciars.lawyeradm.controllers;

import com.gfadvocaciars.lawyeradm.domain.Process;
import com.gfadvocaciars.lawyeradm.services.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/processes")
public class ProcessController {

    @Autowired
    private ProcessService service;

    @GetMapping
    List<Process> findAll(){
        return service.findAll();
    }

    @PostMapping
    Process create(@RequestBody Process process){
        return service.create(process);
    }
}
