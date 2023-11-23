package com.gm2.dev;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	
	public String getMessage() {
		return "Texto de configuracao";
	}
	
	public Integer getCalc (int a, int b) {
		return a+b;
	}
	
	@Bean
	public void init() {
		System.out.println("Inicializado");
	}

}
