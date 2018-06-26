package com.example.helloact.web.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloActController {
    @Value("${message.act}")
    private String message;
    @GetMapping("/")
    public String getMessage() {
        return message;
    }
}
