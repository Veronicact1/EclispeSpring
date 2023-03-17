package com.ejemplo.config;

public class DemoAppConfig {
	// DemoAppConfig.java
	@Configuration 
	@EnableWebMvc
	@ComponentScan(basePackages="com.luv2code.springdemo") 
	public class DemoAppConfig{
	@Bean
	public ViewResolver viewResolver() {
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver(); 
	viewResolver.setPrefix("/WEB-INF/view/");
	viewResolver.setSuffix(".jsp");
	return viewResolver;
	}
	}
}
