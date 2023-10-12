package com.adam.msschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSchoolApplication.class, args);
	}

}
