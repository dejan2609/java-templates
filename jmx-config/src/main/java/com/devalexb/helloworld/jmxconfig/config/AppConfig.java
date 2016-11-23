package com.devalexb.helloworld.jmxconfig.config;

import com.devalexb.helloworld.jmxconfig.domain.log.Log;
import com.devalexb.helloworld.jmxconfig.domain.log.LogMBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alex Bogatikov
 *         Created on 23/11/2016.
 */
@Configuration
@ComponentScan("com.devalexb.helloworld.jmxconfig")
public class AppConfig {

    @Value("${config.log.enable}")
    private boolean enableLogging;

    @Bean
    public LogMBean createLoggingBean() {
        Log logBean = new Log();
        if (enableLogging){
            logBean.enable();
        }

        return logBean;
    }
}
