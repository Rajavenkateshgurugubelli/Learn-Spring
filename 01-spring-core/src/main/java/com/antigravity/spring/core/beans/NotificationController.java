package com.antigravity.spring.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationController {

    private final MessageService messageService;

    // Constructor Injection (Preferred)
    @Autowired
    public NotificationController(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification(String msg) {
        System.out.println("NotificationController: Delegating to service...");
        messageService.sendMessage(msg);
    }
}
