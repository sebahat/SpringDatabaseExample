package com.backend.backend;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DatabaseConnectionTest {
    @Value("${spring.datasource.url}")
    private String jdbcUrl;

    @Value("${spring.datasource.username}")
    private String userName;

    @Value("${spring.datasource.password}")
    private String password;

    @Test
    public void connectionJdbcControl() {
        try {
            Connection connect = DriverManager.getConnection(jdbcUrl, userName, password);
            System.out.println(connect);
        } catch (SQLException e) {
            System.out.println("Error connect");
        }
    }


}
