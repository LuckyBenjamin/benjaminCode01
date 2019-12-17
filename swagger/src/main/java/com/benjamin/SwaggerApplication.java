package com.benjamin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwaggerApplication {


	//启动Spring Boot程序，访问：http://localhost:8080/swagger-ui.html

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}

}
