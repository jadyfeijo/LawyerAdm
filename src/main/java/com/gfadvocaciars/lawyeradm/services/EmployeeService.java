package com.gfadvocaciars.lawyeradm.services;

import com.gfadvocaciars.lawyeradm.domain.Employee;
import com.gfadvocaciars.lawyeradm.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Autowired
    private BCryptPasswordEncoder pe;

    public Employee create(Employee employee){
        employee.setPassword(pe.encode(employee.getPassword()));

        return repository.save(employee);
    }

}
