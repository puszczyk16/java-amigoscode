package com.amigoscode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@SpringBootApplication
@RestController
@RequestMapping("api/v1/customers")
public class Main {
    public static void main(String[] args) {
        // args is anything that comes from commandline
        SpringApplication.run(Main.class, args);
    }
    @GetMapping
    public List<Customer> getCustomers() {
     return List.of();
    }

}
