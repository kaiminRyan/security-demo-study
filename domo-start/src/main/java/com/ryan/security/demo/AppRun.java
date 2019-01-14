package com.ryan.security.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kaimin on 14/1/2019.
 * time : 23:00
 */
@SpringBootApplication
@RestController
public class AppRun {
    public static void main(String[] args) {
        SpringApplication.run(AppRun.class,args);
    }

    @GetMapping("hello")
    public String hello(){
        return "ss";
    }
}
