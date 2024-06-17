package com.codewithaman.assignment.javaconfig;


public class EmailService {

    private final String[] recipients;

    public EmailService(DataSource dataSource) {
        this.recipients = dataSource.getEmails();
    }

    public void sendEmail() {
        for (String recipient : this.recipients) {
            System.out.println("Sending email to " + recipient);
        }
    }

}
