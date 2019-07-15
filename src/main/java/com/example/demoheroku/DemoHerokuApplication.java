package com.example.demoheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
@RestController
public class DemoHerokuApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoHerokuApplication.class, args);
    }

    @GetMapping("/")
    String index() {
        return "Hello Heroku! " + new Date();
    }

}
