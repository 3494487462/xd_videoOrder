package com.zwf.boot1.mapper;


import com.zwf.boot1.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class UserMapper {

    private static Map<String , User> userMap = new HashMap<>();

    static {
        userMap.put("a",new User(1,"a","123"));
        userMap.put("b",new User(2,"b","456"));
        userMap.put("c",new User(3,"c","789"));
    }



    public User login(String username, String pwd){

        User user = userMap.get(username);

        if(user == null){
            return null;
        }

        if(user.getPwd().equals(pwd)){
            return user;
        }

        return null;
    }




    public List<User> listUser(){

        List<User> list = new ArrayList<>();
        list.addAll(userMap.values());
         return list;

    }




}
