package com.gfadvocaciars.lawyeradm.controllers;

import com.gfadvocaciars.lawyeradm.domain.Deadline;
import com.gfadvocaciars.lawyeradm.services.DeadlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/deadlines")
public class DeadlineController {

    @Autowired
    private DeadlineService service;

    @GetMapping
    public List<Deadline> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Deadline findDeadline(@PathVariable("id") String deadlineId) {
        return service.findById(deadlineId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Deadline create(@RequestBody Deadline deadline) {
        return service.create(deadline);
    }

    @PutMapping("/{id}")
    public Deadline updateDeadline(@PathVariable("id") String deadlineId, @RequestBody Deadline deadline) {
        return service.upadate(deadlineId, deadline);
    }
}
