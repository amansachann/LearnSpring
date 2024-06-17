package com.codewithaman.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args) {
        String message = "Good morning! Have a nice day!";
//        SMSService smsService = new SMSService();
//        EmailService emailService = new EmailService();
//        MessageService messageService = new SMSService();
//        MessageSender messageSender = new MessageSender(emailService);
//        messageSender.sendMessage(message);

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender messageSender = context.getBean(MessageSender.class);
        messageSender.sendMessage(message);
    }
}
