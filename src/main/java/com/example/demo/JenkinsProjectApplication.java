package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo")
@ComponentScan("boot.data")
public class JenkinsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsProjectApplication.class, args);
	}

}
