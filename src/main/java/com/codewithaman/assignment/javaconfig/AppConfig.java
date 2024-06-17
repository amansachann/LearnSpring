package com.codewithaman.assignment.javaconfig;


import com.codewithaman.assignment.DataSource;
import com.codewithaman.assignment.EmailService;
import com.codewithaman.assignment.MySQLDataSource;
import com.codewithaman.assignment.PostgreSQLDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public DataSource postgreSQLDataSource() {
        return new PostgreSQLDataSource();
    }

    @Bean
    public DataSource mySQLDataSource() {
        return new MySQLDataSource();
    }

    @Bean
    public EmailService emailService() {
        return new EmailService(postgreSQLDataSource());
    };

}
