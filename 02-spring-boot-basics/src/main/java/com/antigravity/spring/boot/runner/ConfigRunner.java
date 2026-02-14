package com.antigravity.spring.boot.runner;

import com.antigravity.spring.boot.config.AppProperties;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConfigRunner implements CommandLineRunner {

    private final AppProperties appProperties;

    public ConfigRunner(AppProperties appProperties) {
        this.appProperties = appProperties;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loaded Properties: " + appProperties);
    }
}
