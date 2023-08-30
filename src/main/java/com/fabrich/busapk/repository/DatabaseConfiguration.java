package com.fabrich.busapk.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class DatabaseConfiguration {
    @Value("postgres")
    private String username;
    @Value("rodyandry")
    private String password;
    @Bean
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
          "jdbc:postgresql://localhost:5432/bus_traffic",
          username,
          password
        );
    }
}