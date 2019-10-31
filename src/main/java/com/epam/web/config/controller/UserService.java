package com.epam.web.config.controller;

import com.epam.web.config.domain.User;
import com.epam.web.config.dto.UserDto;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger2.mappers.ModelMapper;

@Component
public class UserService {

  public void method() {
    throw new RuntimeException();
  }

  public UserDto save(UserDto user) {
    User user1 = User.builder()
        .id(user.getId())
        .email(user.getEmail())
        .username(user.getUsername()).build();

    return null;
  }
}
