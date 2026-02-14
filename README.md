# Learn Spring Framework

Welcome to the **Learn Spring** repository! This project is designed to help you master the Spring Framework, from the core fundamentals to advanced topics like Spring Boot, Web MVC, Data JPA, and Security.

## Repository Structure

The repository is organized into standalone Maven modules, each covering a specific area of the Spring ecosystem:

- **01-spring-core**: The foundation. Dependency Injection (DI), Inversion of Control (IoC), and Bean lifecycle.
- **02-spring-boot-basics**: Introduction to Spring Boot, auto-configuration, and application properties.
- **03-spring-web**: Building RESTful APIs and web applications using Spring MVC.
- **04-spring-data**: interacting with databases using Spring Data JPA and Hibernate.
- **05-spring-security**: Securing applications with authentication and authorization.
- **06-spring-aop**: Aspect-Oriented Programming for cross-cutting concerns like logging.
- **07-spring-validation**: Validating user input using Bean Validation.
- **08-spring-testing**: Unit and Integration testing with JUnit and Mockito.
- **09-spring-actuator**: Production-ready features like health checks and metrics.

## Prerequisites

- Java 17 or higher
- Maven 3.6+
- An IDE (IntelliJ IDEA, Eclipse, or VS Code)

## How to Run

Each folder is a self-contained Maven project. You can run them individually:

1. Navigate to the module directory (e.g., `cd 01-spring-core`).
2. Run `mvn spring-boot:run` (for Boot projects) or run the `Main` class directly (for Core).
