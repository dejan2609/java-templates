package com.devalexb.helloworld.jmxconfig;

import com.devalexb.helloworld.jmxconfig.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Alex Bogatikov
 *         Created on 22/11/2016.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(
                new Class<?>[] {
                        Application.class,
                        AppConfig.class
                },
                args
        );
    }
}
