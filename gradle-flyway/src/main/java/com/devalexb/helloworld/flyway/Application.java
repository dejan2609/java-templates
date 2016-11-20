package com.devalexb.helloworld.flyway;

import com.devalexb.helloworld.flyway.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Alex Bogatikov
 *         Created on 19/11/2016.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(
                new Class<?> [] {
                        Application.class,
                        AppConfig.class
                },
                args
        );
    }
}
