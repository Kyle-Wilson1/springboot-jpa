package com.test.service;

import com.test.UserDao.*;
import com.test.User.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UserService {
    @Autowired
    private UserDao userRepositoty;

    public List<User> findUserByName(String name){
        List<User> user = null;
        try{
            user = userRepositoty.findUserByName(name);
        }catch (Exception e){}
        return user;
    }

    public List<User> findAll(){
        List<User> list = null;
        try{
            list = userRepositoty.findAll();
        }catch (Exception e){}
        return list;
    }

    public User save(User user){
        User ret_user = null;
        try{
            ret_user = userRepositoty.save(user);
        }catch (Exception e){}
        return ret_user;
    }

    public void delete(User user){
        try{
            userRepositoty.delete(user);
        }catch (Exception e){}
        return;
    }

}