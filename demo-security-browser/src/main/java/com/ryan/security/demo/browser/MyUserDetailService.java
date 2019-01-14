package com.ryan.security.demo.browser;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * Created by kaimin on 14/1/2019.
 * time : 23:36
 * spring security获取用户信息
 */
@Component
@Slf4j
public class MyUserDetailService implements UserDetailsService {


    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //可以根据用户名查找用户信息
        log.info("登录用户名：{}",username);
        String pwd = passwordEncoder.encode("123");
        log.info("数据库密码是："+pwd);
        //拿到之后组装成用户信息, 第三个参数时权限信息
        return new User(username,pwd, AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
