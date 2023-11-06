package com.simple.kafkasns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class KafkasnsApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkasnsApplication.class, args);
    }

}
