package com.antigravity.spring.validation.controller;

import com.antigravity.spring.validation.dto.InputData;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/validate")
public class ValidationController {

    @PostMapping
    public ResponseEntity<?> validateInput(@Valid @RequestBody InputData input, BindingResult result) {
        if (result.hasErrors()) {
            String errors = result.getFieldErrors().stream()
                    .map(err -> err.getField() + ": " + err.getDefaultMessage())
                    .collect(Collectors.joining(", "));
            return ResponseEntity.badRequest().body("Validation Failed: " + errors);
        }
        return ResponseEntity.ok("Validation Passed for user: " + input.getName());
    }
}
