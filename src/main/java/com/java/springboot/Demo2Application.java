package com.java.springboot;

import com.java.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(Demo2Application.class, args);
        System.out.println(ac.getBean(UserService.class));
    }

}
