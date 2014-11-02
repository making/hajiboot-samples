package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // (1)
@EnableAutoConfiguration // (2)
public class App {

    @RequestMapping("/") // (3)
    String home() {
        return "Hello World!"; // (4)
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args); // (5)
    }
}
