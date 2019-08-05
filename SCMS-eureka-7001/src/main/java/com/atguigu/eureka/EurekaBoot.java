package com.atguigu.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaBoot {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaBoot.class, args);
	}

}
