package com.epam.web.springServletExample;

import java.io.IOException;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomDispatcherServlet extends HttpServlet {

  private final Map<String, Command> commandMap;

  @Autowired
  public CustomDispatcherServlet(Map<String, Command> commandMap) {
    this.commandMap = commandMap;
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
    process(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
    process(req, resp);
  }

  private void process(HttpServletRequest req, HttpServletResponse resp) {
    String action = req.getParameter("command");

    Command command = commandMap.get(action);
    command.execute(req, resp);
  }
}
