package com.codewithaman.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {

    public String hello() {
        return "Hello Repository";
    }
}
