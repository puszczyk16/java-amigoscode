package com.amigoscode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@ComponentScan(basePackages = "com.amigoscode")
//@EnableAutoConfiguration
@RestController
public class Main {
    public static void main(String[] args) {
        // args is anything that comes from commandline
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet1")
    public GreetResponse blala() {
        return new GreetResponse("Hello");
    }
    record GreetResponse(String greet123) {}
}
