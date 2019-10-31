package com.epam.web.springServletExample;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {

  void execute(HttpServletRequest request, HttpServletResponse response);

}
