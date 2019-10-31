package com.epam.web.config.controller;

import com.epam.web.config.domain.User;
import com.epam.web.config.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping("/user")
  @ResponseStatus(HttpStatus.CREATED)
  public UserDto createUser(@RequestBody UserDto user) {
    return userService.save(user);
  }

  @ResponseStatus(HttpStatus.OK)
  @PutMapping("/user/{userId}")
  public User update(@PathVariable(value = "userId") Long id, @RequestBody User user) {
    return null;
  }

  @ResponseStatus(HttpStatus.OK)
  @GetMapping("/user/{id}")
  public User getUser(@PathVariable Long id) {
    return null;
  }

  @ResponseStatus(HttpStatus.NO_CONTENT)
  @DeleteMapping("/user/{id}")
  public void delete(@PathVariable Long id) {

  }

  @PostMapping("/upload")
  public void upload(@RequestParam("file") MultipartFile file) {

  }

}

