package com.arindam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "com.arindam")
@PropertySource("classpath:application.properties")
public class SpringConfig {

}
