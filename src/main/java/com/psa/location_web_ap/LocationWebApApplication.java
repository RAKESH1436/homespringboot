package com.psa.location_web_ap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/*@ComponentScan( basePackages ={"com.psa.location_web_ap.controller"})*/
public class LocationWebApApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocationWebApApplication.class, args);
	}

}
