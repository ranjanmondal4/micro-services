package com.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableConfigServer
@EnableAutoConfiguration 
//@EnableEurekaClient
public class MicroConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroConfigServerApplication.class, args);
	}
}
