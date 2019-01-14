package com.ryan.security.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * Created by kaimin on 14/1/2019.
 * time : 23:16
 */
@Data
@AllArgsConstructor
public class User {

    private String username;
    private String id;
    private Date birthday;
    private String password;
}
