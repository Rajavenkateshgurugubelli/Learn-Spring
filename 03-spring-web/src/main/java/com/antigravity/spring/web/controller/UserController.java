package com.antigravity.spring.web.controller;

import com.antigravity.spring.web.dto.UserDTO;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private List<UserDTO> users = new ArrayList<>();

    public UserController() {
        users.add(new UserDTO(1L, "Alice", "Admin"));
        users.add(new UserDTO(2L, "Bob", "User"));
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return users;
    }

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable Long id) {
        return users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElse(null); // In real app, throw 404 exception
    }

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO user) {
        user.setId((long) (users.size() + 1));
        users.add(user);
        return user;
    }
}
