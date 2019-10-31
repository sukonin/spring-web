package com.epam.web.servletExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.servlet.http.HttpServletRequest;
import lombok.SneakyThrows;

public class RequestMapper {

  private Map<String, Command> commands = new HashMap<>();

  private static RequestMapper requestMapper;

  @SneakyThrows
  private RequestMapper()  {
    commands.put("login", new LoginCommand());
    /*And may others....
     *
     *  commands.put("order", new OrderCommand());
     *  commands.put("buy", new BuyCommand());
     *  commands.put("singUp", new SingUpCommand());
     *  commands.put("logout", new LogoutCommand());
     *       */
    Thread.sleep(10000);
  }

  public Command getCommand(HttpServletRequest request) {
    String action = request.getParameter("command");
    return Objects.requireNonNull(commands.get(action), "Command not found!");
  }

  public static RequestMapper getInstance() {
    if (requestMapper == null) {
      requestMapper = new RequestMapper();
    }
    return requestMapper;
  }

}
