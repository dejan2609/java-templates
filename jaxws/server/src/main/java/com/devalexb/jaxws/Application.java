package com.devalexb.jaxws;

import com.devalexb.jaxws.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Alex Bogatikov
 *         Created on 12/11/2016.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(
                new Class<?>[] {
                        AppConfig.class
                },
                args
        );
    }
}