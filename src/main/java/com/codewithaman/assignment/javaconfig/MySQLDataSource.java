package com.codewithaman.assignment.javaconfig;

public class MySQLDataSource implements DataSource {

    private final String[] emails = {
            "john.doe@example.com",
            "jane.smith@example.com",
            "mike.jones@example.com",
            "lisa.wong@example.com",
            "tom.brown@example.com"
    };
    @Override
    public String[] getEmails() {
        return emails;
    }
}
