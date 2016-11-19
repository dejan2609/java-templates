package com.devalexb.helloworld.deploy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Alex Bogatikov
 *         Created on 18/11/2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.devalexb.helloworld.deploy")
public class AppConfig {
}
