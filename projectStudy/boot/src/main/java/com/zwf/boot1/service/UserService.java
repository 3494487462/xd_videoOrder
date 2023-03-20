package com.zwf.boot1.service;


import com.zwf.boot1.domain.User;

import java.util.List;

public interface UserService {

    String login(String username, String pwd);


    List<User> listUser();

}
