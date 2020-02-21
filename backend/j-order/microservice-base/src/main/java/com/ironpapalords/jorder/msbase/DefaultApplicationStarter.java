package com.ironpapalords.jorder.msbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DefaultApplicationStarter extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DefaultApplicationStarter.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(DefaultApplicationStarter.class, args);
	}
}