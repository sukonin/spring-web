package com.epam.web.config.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebApplicationConfig implements WebApplicationInitializer {

  @Override
  public void onStartup(ServletContext servletContext) {

    AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();

    context.scan("com.epam.web.config");

    servletContext.addListener(new ContextLoaderListener(context));

    ServletRegistration.Dynamic appServlet = servletContext
        .addServlet("mvc", new DispatcherServlet(context));

    appServlet.setLoadOnStartup(1);
    appServlet.addMapping("/");
  }
}
