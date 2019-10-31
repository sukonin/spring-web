package com.epam.web.config.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

  @ExceptionHandler(RuntimeException.class)
  public void catchException(RuntimeException ex) {
    System.out.println(ex.getMessage());
  }
}
