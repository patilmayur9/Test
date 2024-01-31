package com.aurionpro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Autowired
    private Environment environment;


////    @Value("${application.properties}")
//    @Value("${property.from.database}")
    private String exampleProperty;

    @GetMapping("/msg")
    public String getMessage() {
        return environment.getProperty("exampleProperty-> "+exampleProperty);
    }
}
