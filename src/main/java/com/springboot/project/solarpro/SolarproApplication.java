package com.springboot.project.solarpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
//@ImportResource(locations = {"classpath:bean.xml"})
public class SolarproApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolarproApplication.class, args);
	}
	@RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
	String index(){
		return "Hello Spring Boot!";
	}
}
