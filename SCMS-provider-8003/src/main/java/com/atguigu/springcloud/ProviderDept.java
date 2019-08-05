package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("com.atguigu.springcloud.mapper")
@EnableEurekaClient
@SpringBootApplication
public class ProviderDept {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ProviderDept.class, args);
	}

}
