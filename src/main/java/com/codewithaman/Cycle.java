package com.codewithaman;

import org.springframework.stereotype.Component;

@Component
public class Cycle implements Vehicle {

    @Override
    public void move() {
        System.out.println("Cycle is moving...");
    }
}
