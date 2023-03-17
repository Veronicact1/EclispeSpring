package com.ejemplo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringDispacherServletInitializer extends 
AbstractAnnotationConfigDispatcherServletInitializer {
@Override
protected Class<?>[] getRootConfigClasses() { 
return null;
}
@Override
protected Class<?>[] getServletConfigClasses() { 
return new Class[] { DemoAppConfig.class };
}
@Override
protected String[] getServletMappings() { 
return new String[] { "/" };
}
}