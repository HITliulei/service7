package com.test.service7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Service7Application {

    public static void main(String[] args) {
        SpringApplication.run(Service7Application.class, args);
    }

}
