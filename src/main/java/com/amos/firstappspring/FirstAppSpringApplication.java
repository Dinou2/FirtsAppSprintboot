package com.amos.firstappspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstAppSpringApplication {

    public static void main(String[] args) {

        SpringApplication.run(FirstAppSpringApplication.class, args);
        System.out.println("Hello World");
    }

}
