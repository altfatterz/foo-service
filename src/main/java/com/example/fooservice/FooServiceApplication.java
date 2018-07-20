package com.example.fooservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigurationProperties(FooProperties.class)
public class FooServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FooServiceApplication.class, args);
    }
}

@RestController
class FooController {

    private FooProperties fooProperties;

    public FooController(FooProperties fooProperties) {
        this.fooProperties = fooProperties;
    }

    @GetMapping("/")
    public String foo() {
        return fooProperties.getMessage() + "/" + fooProperties.getSecret();
    }
}
