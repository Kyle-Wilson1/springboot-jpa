package com.test.service;

import com.test.UserDao.*;
import com.test.User.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userRepositoty;

    public User findUserByName(String name){
        User user = null;
        try{
            user = userRepositoty.findByUserName(name);
        }catch (Exception e){}
        return user;
    }
}