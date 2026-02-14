package com.antigravity.spring.aop.service;

import org.springframework.stereotype.Service;

@Service
public class BusinessService {

    public String doSomething() {
        // Simulate work
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Work Done";
    }

    public void throwError() {
        throw new RuntimeException("Simulated specific error");
    }
}
