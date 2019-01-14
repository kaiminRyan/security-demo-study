package com.ryan.security.demo.controller;

import com.ryan.security.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by kaimin on 14/1/2019.
 * time : 23:15
 */
@RestController("user")
public class UserController {

    @GetMapping
    public List<User> get(){
        List<User> list=new ArrayList<>();
        User u1=new User("111","1",new Date(),"123");
        User u2=new User("112","1",new Date(),"123");
        User u3=new User("113","1",new Date(),"123");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        return list;
    }
}
