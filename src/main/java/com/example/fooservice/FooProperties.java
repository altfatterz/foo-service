package com.example.fooservice;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "foo")
@Data
public class FooProperties {

    private String message;
    private String secret;

}
