package com.antigravity.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.antigravity.spring.core.beans")
public class AppConfig {
    // ComponentScan will automatically find our @Component classes
}
