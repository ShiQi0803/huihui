package com.hs.testone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TestoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestoneApplication.class, args);
    }

}
