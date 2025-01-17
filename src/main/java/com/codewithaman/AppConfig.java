package com.codewithaman;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Vehicle car(){
        return new Car();
    }

    @Bean
    public Vehicle bike() {
        return new Bike();
    }

    @Bean
    public Vehicle cycle() {
        return new Cycle();
    }

    @Bean
    public Traveller traveller() {
        return new Traveller(cycle());   // Dependency Injection
    }
}
