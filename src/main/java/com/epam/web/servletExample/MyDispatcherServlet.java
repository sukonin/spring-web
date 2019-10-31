package com.epam.web.servletExample;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
@WebServlet(value = "/", name = "dispatcherServlet")
*/
public class MyDispatcherServlet extends HttpServlet {

  private final RequestMapper requestMapper;

  public MyDispatcherServlet() {
    requestMapper = RequestMapper.getInstance();
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
    doProcess(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
    doProcess(req, resp);
  }

  private void doProcess(HttpServletRequest req, HttpServletResponse resp) {
    Command command = requestMapper.getCommand(req);
    command.execute(req, resp);
  }
}
