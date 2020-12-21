package com.example.Desafio.configuration;

import com.example.Desafio.service.UserService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class ServiceConfiguration {

    @Bean
    public UserService userService(){
        return new UserService();
    }

}