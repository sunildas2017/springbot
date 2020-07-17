package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ConfigurationProperties(prefix="ignore")
public class ExampleRest {
	
	@Autowired WelcomeService service;

	@RequestMapping("/test")
    String home() {
		List<String> l1 = service.getServers();
        return l1.get(1);
    }

    public static void main(String[] args) {
        SpringApplication.run(ExampleRest.class, args);
        
    }
}
