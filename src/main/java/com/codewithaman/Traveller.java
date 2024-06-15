package com.codewithaman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Traveller {

    Vehicle vehicle;

    @Autowired
    public Traveller(@Qualifier("cycle") Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void startJourney() {
        this.vehicle.move();
    }
}
