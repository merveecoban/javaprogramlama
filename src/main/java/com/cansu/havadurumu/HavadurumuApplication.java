package com.cansu.havadurumu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
public class HavadurumuApplication {

    public static void main(String[] args) {
        SpringApplication.run(HavadurumuApplication.class, args);
    }
}
