package com.epam.web.servletExample;

import java.util.Set;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

public class WebInitConfig implements ServletContainerInitializer {

  @Override
  public void onStartup(Set<Class<?>> c, ServletContext ctx) {
    System.out.println("Starting context...");
    Dynamic dispatcherServlet = ctx.addServlet("dispatcherServlet", new MyDispatcherServlet());
    dispatcherServlet.setLoadOnStartup(1);
    dispatcherServlet.addMapping("/");
    System.out.println("Application is ready!");
  }
}
