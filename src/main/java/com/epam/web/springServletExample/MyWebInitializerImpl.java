package com.epam.web.springServletExample;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyWebInitializerImpl implements MyWebInitializer {

  @Override
  public void onStartup(ServletContext servletContext) {
    System.out.println("Starting context...");

    ApplicationContext context = new AnnotationConfigApplicationContext(
        "com.epam.web.springServletExample");

    ServletRegistration.Dynamic appServlet = servletContext
        .addServlet("mvc", context.getBean(CustomDispatcherServlet.class));

    appServlet.setLoadOnStartup(1);
    appServlet.addMapping("/");

    System.out.println("Application is ready!");
  }
}
