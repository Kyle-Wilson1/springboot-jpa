package com.test.controller;

import com.test.User.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.*;

/**
 * Created by Song on 2017/2/15.
 * User控制层
 */
@RestController
@RequestMapping(value = "/")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index")
    public String index(){
        return "user/index";
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List<User> find(@RequestParam(value = "name")String name){
        return  userService.findUserByName(name);
    }

    @RequestMapping(value = "/user/all",method = RequestMethod.GET)
    public List<User> findAll(){
        return  userService.findAll();
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User save(@RequestParam(value = "name")String name, @RequestParam(value = "age")Integer age){
        User user = new User(name,age);
        return userService.save(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public void delete(@RequestParam(value = "name")String name, @RequestParam(value = "age")Integer age){
        User user = new User(name,age);
        userService.delete(user);
    }
}