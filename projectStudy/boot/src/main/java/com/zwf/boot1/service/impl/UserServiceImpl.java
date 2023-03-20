package com.zwf.boot1.service.impl;

import com.zwf.boot1.domain.User;
import com.zwf.boot1.mapper.UserMapper;
import com.zwf.boot1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {


    public static Map<String,User> sessionMap = new HashMap<>();


    @Autowired
    private UserMapper userMapper;

    @Override
    public String login(String username, String pwd) {

        User user = userMapper.login(username,pwd);

        if(user==null){
            return null;
        }else {

            String token = UUID.randomUUID().toString();
            System.out.println(token);
            sessionMap.put(token,user);
            return token;
        }

    }

    @Override
    public List<User> listUser() {
        return userMapper.listUser();
    }
}
