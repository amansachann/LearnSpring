package com.codewithaman.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

    private final String[] recipients;

    @Autowired
    public EmailService(DataSource dataSource) {
        this.recipients = dataSource.getEmails();
    }

    public void sendEmail() {
        for (String recipient : this.recipients) {
            System.out.println("Sending email to " + recipient);
        }
    }

}
