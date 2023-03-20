package com.zwf.boot1.controller;

import com.zwf.boot1.service.UserService;
import com.zwf.boot1.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zwf.boot1.domain.User;

@RestController
@RequestMapping("api/v1/pub/user")
public class UserController {


//    @PostMapping("login")
//    public JsonData login(String pwd, String username){
//
//        System.out.println("username=" + username + " pwd="+pwd);
//
//        return JsonData.buildSuccess("");
//    }


    @Autowired
    public UserService userService;


    /**
     * 登录接口
     * @param user
     * @return
     */
    @PostMapping("login")
    public JsonData login(@RequestBody User user){

        System.out.println("user=" + user.toString());

        String token = userService.login(user.getUsername(), user.getPwd());


        return token !=null ? JsonData.buildSuccess(token) : JsonData.buildError("账号密码错误");
    }


    /**
     * 列出全部用户
     * @return
     */
    @GetMapping("list")
    public JsonData listUser(){

        return  JsonData.buildSuccess(userService.listUser());

    }






}
