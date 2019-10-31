package com.epam.web.springServletExample;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("login")
public class LoginCommand implements Command {

  /*http://localhost:8888/?command=login&login=admin&password=pass*/

  private static final String PARAM_NAME_USERNAME = "username";
  private static final String PARAM_NAME_PASSWORD = "password";

  private final UserService userService;

  @Autowired
  public LoginCommand(UserService userService) {
    this.userService = userService;
  }

  @Override
  public void execute(HttpServletRequest request, HttpServletResponse response) {
    String username = request.getParameter(PARAM_NAME_USERNAME);
    String pass = request.getParameter(PARAM_NAME_PASSWORD);

    User user = userService.findUser(username);

    if (user.getPassword().equals(pass)) {
      response.setStatus(HttpServletResponse.SC_OK);
    } else {
      response.setStatus(HttpServletResponse.SC_FORBIDDEN);
    }
  }
}
