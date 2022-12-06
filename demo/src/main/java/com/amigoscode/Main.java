package com.amigoscode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

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
        return new GreetResponse("Hello1");
    }
    //records are classes that allow to achieve immutability
    //equivalent class to record below is
    /*
    class GreetResponse {
        private final String greet;
        public GreetResponse(String bla) {
            this.greet = bla;
        }
        public String getGreet() {
            return greet;
        }
        @Override
        public String toString() {
            return "GreetResponse{" +
                    "greet='" + greet + '\'' +
                    '}';
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GreetResponse that = (GreetResponse) o;
            return Objects.equals(greet, that.greet);
        }

        @Override
        public int hashCode() {
            return Objects.hash(greet);
        }

    }
    */
    record GreetResponse(String greet) {}
}
