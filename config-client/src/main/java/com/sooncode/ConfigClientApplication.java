package com.sooncode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class ConfigClientApplication {
 
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
 
}
