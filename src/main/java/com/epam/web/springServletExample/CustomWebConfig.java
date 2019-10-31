package com.epam.web.springServletExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.annotation.HandlesTypes;
import lombok.SneakyThrows;
import org.springframework.util.ReflectionUtils;
/*
@HandlesTypes({MyWebInitializer.class})
public class CustomWebConfig implements ServletContainerInitializer {

*//*  @Override
  @SneakyThrows
  public void onStartup(Set<Class<?>> classes, ServletContext servletContext) {

    List<MyWebInitializer> webInitializers = new ArrayList<>();

    for (Class<?> aClass : classes) {
      webInitializers.add(
          (MyWebInitializer) ReflectionUtils.accessibleConstructor(aClass).newInstance());
    }

    *//**//*webInitializers.sort(...);*//**//*

    for (MyWebInitializer webInitializer : webInitializers) {
      webInitializer.onStartup(servletContext);
    }
  }*//*
}*/
