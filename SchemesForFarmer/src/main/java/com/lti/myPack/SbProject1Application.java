package com.lti.myPack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.lti.myPack")
public class SbProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(SbProject1Application.class, args);
	}

}
