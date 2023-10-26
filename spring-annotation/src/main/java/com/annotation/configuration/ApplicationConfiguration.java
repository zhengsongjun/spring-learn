package com.annotation.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.annotation"})
@PropertySource({"classpath:jdbc.properties"})
public class ApplicationConfiguration {
}
