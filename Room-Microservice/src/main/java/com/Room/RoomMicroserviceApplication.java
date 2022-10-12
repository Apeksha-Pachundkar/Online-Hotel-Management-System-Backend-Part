package com.Room;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/*
@SpringBootApplication
public class RoomMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomMicroserviceApplication.class, args);
	}

}*/

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class RoomMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomMicroserviceApplication.class, args);
	}

}
