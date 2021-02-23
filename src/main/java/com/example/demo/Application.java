package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@RestController
public class Application {

	  public static void main(String[] args) {
		      SpringApplication.run(Application.class);
          }

@RequestMapping("/hello")
          private String hello() {
                      return "Hello World!";
          }
}
