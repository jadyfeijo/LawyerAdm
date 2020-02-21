package com.gfadvocaciars.lawyeradm.controllers;

import com.gfadvocaciars.lawyeradm.domain.Employee;
import com.gfadvocaciars.lawyeradm.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    Employee create(@RequestBody Employee employee){
        return service.create(employee);
    }

}
