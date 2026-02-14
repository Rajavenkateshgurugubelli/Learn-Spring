package com.antigravity.spring.core;

import com.antigravity.spring.core.beans.NotificationController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 1. Initialize Spring Context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // 2. Retrieve Bean
        NotificationController controller = context.getBean(NotificationController.class);

        // 3. Use Bean
        System.out.println("--- Spring Core Demo ---");
        controller.sendNotification("Hello Spring Core!");

        // 4. Close Context (Cast to specific implementation to close, or use
        // try-with-resources if applicable)
        ((AnnotationConfigApplicationContext) context).close();
    }
}
