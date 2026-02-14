package com.antigravity.spring.aop;

import com.antigravity.spring.aop.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopApplication implements CommandLineRunner {

    @Autowired
    private BusinessService businessService;

    public static void main(String[] args) {
        SpringApplication.run(AopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- Triggering AOP ---");
        businessService.doSomething();

        System.out.println("\n--- Triggering Exception ---");
        try {
            businessService.throwError();
        } catch (RuntimeException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }
    }
}
