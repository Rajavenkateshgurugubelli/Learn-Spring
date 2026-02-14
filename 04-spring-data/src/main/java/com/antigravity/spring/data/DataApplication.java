package com.antigravity.spring.data;

import com.antigravity.spring.data.entity.Product;
import com.antigravity.spring.data.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DataApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(ProductRepository repository) {
        return (args) -> {
            // Save a few products
            repository.save(new Product("Laptop", 999.99));
            repository.save(new Product("Mouse", 19.99));
            repository.save(new Product("Keyboard", 49.99));

            // Fetch all customers
            System.out.println("--- All Products ---");
            repository.findAll().forEach(System.out::println);

            // Fetch by name
            System.out.println("\n--- Products containing 'Mouse' ---");
            repository.findByNameContaining("Mouse").forEach(System.out::println);
        };
    }
}
