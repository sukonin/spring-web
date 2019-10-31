package com.epam.web.servletExample;

import com.epam.web.springServletExample.User;
import org.springframework.stereotype.Service;

public class UserService {

  public User findUser(String username) {
    User user = new User();
    user.setPassword("pass");
    return user;
  }
}
