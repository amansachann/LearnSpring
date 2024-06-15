package com.codewithaman;


import com.codewithaman.controller.DemoController;
import com.codewithaman.repository.DemoRepository;
import com.codewithaman.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoClient {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        DemoController demoController = applicationContext.getBean(DemoController.class);
        System.out.println(demoController.hello());

        DemoRepository repositoryController = applicationContext.getBean(DemoRepository.class);
        System.out.println(repositoryController.hello());

        DemoService demoService = applicationContext.getBean(DemoService.class);
        System.out.println(demoService.hello());
    }
}
