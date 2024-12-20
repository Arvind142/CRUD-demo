package io.github.arvind142.crud_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

@Configuration
public class DateConfig {

    @Bean
    public SimpleDateFormat getDateFormat(){
        return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS E");
    }
}
