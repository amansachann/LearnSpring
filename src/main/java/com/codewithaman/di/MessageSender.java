package com.codewithaman.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    //    SMSService smsService = new SMSService();
//    EmailService emailService = new EmailService();

    @Autowired
    @Qualifier("emailService")
    private MessageService messageService;

    @Autowired
    @Qualifier("SMSService")
    private MessageService smsService;

    //    public MessageSender(SMSService smsService) {
//        this.smsService = smsService;
//    }
//
//    public MessageSender(EmailService emailService) {
//        this.emailService = emailService;
//    }
    //@Autowired
//    public MessageSender(@Qualifier("emailService") MessageService messageService) {
//        this.messageService = messageService;
//        System.out.println("Constructor based dependency Injection-1");
//    }
//    @Autowired
//    public MessageSender(@Qualifier("emailService") MessageService messageService) {
//        this.messageService = messageService;
//        System.out.println("Constructor based dependency Injection-2");
//    }

//    @Autowired
//    public void setMessageService(@Qualifier("emailService") MessageService messageService) {
//        this.messageService = messageService;
//        System.out.println("Setter based dependency injection-1");
//    }
//
//    @Autowired
//    public void setSmsService(@Qualifier("SMSService") MessageService smsService) {
//        this.smsService = smsService;
//        System.out.println("Setter based dependency injection-2");
//    }

    public void sendMessage(String message) {
//        this.smsService.sendMessage(message);
//        this.emailService.sendMessage(message);
        this.messageService.sendMessage(message);
        this.smsService.sendMessage(message);
    }

}

