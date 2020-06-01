package com.demo.domain.persistence.get.persistence.guide.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GetPersistenceGuideApplication {
    public static void main(String[] args) {
        SpringApplication.run(GetPersistenceGuideApplication.class,args);
    }
}
