package com.demo.domain.persistence.get.persistence.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.demo.domain.persistence.get.persistence.service.dao")
public class GetPersistenceServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(GetPersistenceServiceApplication.class,args);
    }
}
