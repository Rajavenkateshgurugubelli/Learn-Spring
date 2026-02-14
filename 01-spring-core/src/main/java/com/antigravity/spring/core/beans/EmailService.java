package com.antigravity.spring.core.beans;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("EmailService: Sending email with message: " + message);
    }
}
