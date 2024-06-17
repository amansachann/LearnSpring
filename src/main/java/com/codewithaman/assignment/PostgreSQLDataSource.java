package com.codewithaman.assignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgreSQLDataSource implements DataSource{

    private final String[] emails = {
            "alice.williams@example.com",
            "bob.johnson@example.com",
            "carol.davis@example.com",
            "dave.miller@example.com",
            "eva.white@example.com"
    };

    public String[] getEmails() {
        return emails;
    }

}
