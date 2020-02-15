package com.gfadvocaciars.lawyeradm.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.IOException;

@RestControllerAdvice
public class LaywerAdmExceptionHandler {

    @RequestMapping(produces = "application/json")
    @ExceptionHandler(value = {NotFoundException.class})
    ResponseEntity handleNotFound(Throwable ex) {
      return   ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
