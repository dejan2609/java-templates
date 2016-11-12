package com.devalexb.config;

import com.devalexb.domain.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

/**
 * @author Alex Bogatikov
 *         Created on 12/11/2016.
 */
@Configuration
@ComponentScan("com.devalexb")
public class AppConfig {


    @Bean
    public SimpleJaxWsServiceExporter getExplorer() {
        SimpleJaxWsServiceExporter exporter = new SimpleJaxWsServiceExporter();
        exporter.setBaseAddress("http://127.0.0.1:8080/");
        return exporter;
    }


    @Bean
    public HelloWorld getHelloWorld() {
        return new HelloWorld();
    }
}
