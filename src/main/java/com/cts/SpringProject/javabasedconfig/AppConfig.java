package com.cts.SpringProject.javabasedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public ClassABC classABC() {
		return new ClassABC();
	}

	@Bean
	public ClassXYZ classXYZ() {
		return new ClassXYZ();
	}
}
