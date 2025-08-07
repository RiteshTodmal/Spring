package com.ninfinity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	public Student std1() {
		Student s1 = new Student();
		return s1;
	}
}
