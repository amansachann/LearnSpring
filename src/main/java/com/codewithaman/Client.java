package com.codewithaman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
//        Vehicle vehicle = new Car();
//        Traveller traveller = new Traveller(vehicle);
//        traveller.startJourney();

//        Create the Spring IOC Container
//        Read the configuration class
//        Create and manage spring beans
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car = applicationContext.getBean(Car.class);
        car.move();

        Bike bike = applicationContext.getBean(Bike.class);
        bike.move();

        Traveller traveller = applicationContext.getBean(Traveller.class);
        traveller.startJourney();
    }
}
