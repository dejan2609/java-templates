package com.devalexb.helloworld.flyway.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;

/**
 * @author Alex Bogatikov
 *         Created on 19/11/2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.devalexb.helloworld.flyway")
public class AppConfig {


    @Value("${config.datasource.classname}")
    String classname;

    @Value("${config.datasource.jdbcUrl}")
    String jdbcUrl;

    @Value("${config.datasource.username}")
    String username;

    @Value("${config.datasource.password}")
    String password;

    @Bean
    public PlatformTransactionManager createPlatformTransactionManager(javax.sql.DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    public DataSource createDataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(jdbcUrl);
        config.setUsername(username);
        config.setPassword(password);
        config.setDriverClassName(classname);
        config.setPoolName("pool");
        config.setConnectionTestQuery("select 1");

        return new HikariDataSource(config);
    }

}
