package com.epam.web.servletExample;

import com.epam.web.springServletExample.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCommand implements Command {

  private static final String PARAM_NAME_LOGIN = "username";
  private static final String PARAM_NAME_PASSWORD = "password";

  private UserService userService = new UserService();

  @Override
  public void execute(HttpServletRequest request, HttpServletResponse response) {
    String login = request.getParameter(PARAM_NAME_LOGIN);
    String pass = request.getParameter(PARAM_NAME_PASSWORD);

    User user = userService.findUser(login);

    if (user.getPassword().equals(pass)) {
      response.setStatus(HttpServletResponse.SC_OK);
    } else {
      response.setStatus(HttpServletResponse.SC_FORBIDDEN);
    }
  }
}
