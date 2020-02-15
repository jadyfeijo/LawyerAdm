package com.gfadvocaciars.lawyeradm.controllers;

import com.gfadvocaciars.lawyeradm.domain.Process;
import com.gfadvocaciars.lawyeradm.services.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
