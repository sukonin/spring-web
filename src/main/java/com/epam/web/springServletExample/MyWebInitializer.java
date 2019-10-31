package com.epam.web.springServletExample;

import javax.servlet.ServletContext;

public interface MyWebInitializer {

  void onStartup(ServletContext servletContext);
}
