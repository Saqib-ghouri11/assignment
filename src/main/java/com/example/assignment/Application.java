package com.example.assignment;

import org.h2.server.web.WebServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages={"com.technicalkeeda"})
@EntityScan(basePackages = "com.example.assignment.models")
@ComponentScan(basePackages = "com.example.assignment")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	 
//	@Bean
//	public ServletRegistrationBean<WebServlet> h2servletRegistration() {
//	    ServletRegistrationBean<WebServlet> registration = new ServletRegistrationBean<WebServlet>(new WebServlet());
//	    registration.addUrlMappings("/console/*");
//	    return registration;
//	}
//	
}
