package com.codewithaman.controller;

import com.codewithaman.service.DemoService;
import org.springframework.stereotype.Controller;

@Controller
public class DemoController {

    private DemoService demoService;

    public String hello() {
        return "Hello Controller";
    }
}
