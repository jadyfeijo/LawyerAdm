package com.gfadvocaciars.lawyeradm.controllers;

import com.fasterxml.jackson.datatype.jsr310.deser.key.OffsetTimeKeyDeserializer;
import com.gfadvocaciars.lawyeradm.domain.Deadline;
import com.gfadvocaciars.lawyeradm.services.DeadlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "/deadlines")
public class DeadlineController {

    @Autowired
    private DeadlineService service;

    @GetMapping
    public ResponseEntity<List<Deadline>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping
    public ResponseEntity<Deadline> create(@RequestBody Deadline deadline){
        return ResponseEntity.ok(service.create(deadline));
    }
}
