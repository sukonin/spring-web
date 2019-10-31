package com.epam.web.springServletExample;

import org.springframework.stereotype.Service;

@Service
public class UserService {

  public User findUser(String username) {
    User user = new User();
    user.setId(1L);
    user.setUsername("ololo@epam.com");
    user.setPassword("pass");
    return user;
  }
}
