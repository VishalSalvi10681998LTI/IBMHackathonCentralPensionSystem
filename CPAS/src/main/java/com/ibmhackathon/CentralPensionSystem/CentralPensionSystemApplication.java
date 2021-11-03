package com.ibmhackathon.CentralPensionSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com"})
public class CentralPensionSystemApplication extends SpringBootServletInitializer	 {

	public static void main(String[] args) {
		SpringApplication.run(CentralPensionSystemApplication.class, args);
	}

}
