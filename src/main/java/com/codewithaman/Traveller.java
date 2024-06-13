package com.codewithaman;

public class Traveller {

    Vehicle vehicle;

    public Traveller(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void startJourney() {
        this.vehicle.move();
    }
}
