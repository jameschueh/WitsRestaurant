package com.example.restaurant.config;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RunnerConfig {

    @Bean(name = "customDdlApplicationRunner")
    public ApplicationRunner customDdlApplicationRunner() {
        return args -> {
            System.out.println("Custom DDL Application Runner executed.");
        };
    }   
    
}
