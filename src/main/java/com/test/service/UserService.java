package com.test.service;

import com.test.UserDao.*;
import com.test.User.*;
import com.test.response.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
public class UserService {
    @Autowired
    private UserDao userRepositoty;

    public List<User> findUserByName(String name){
        List<User> user = null;
        try{
            user = userRepositoty.findUserByName(name);
        }catch (Exception e){
            System.out.println(e);
        }
        return user;
    }

    @Transactional
    public int updateAgeByName(String name, Long age){
        int user = 0;
        try{
            user = userRepositoty.updateAgeByName(name,age);
        }catch (Exception e){
            System.out.println(e);
        }
        return user;
    }

    public List<User> findAll(){
        List<User> list = null;
        try{
            list = userRepositoty.findAll();
        }catch (Exception e){
            System.out.println(e);
        }
        return list;
    }

    public User save(User user){
        User ret_user = null;
        try{
            ret_user = userRepositoty.save(user);
        }catch (Exception e){
            System.out.println(e);
        }
        return ret_user;
    }

    @Transactional
    public RestResponse delete(String name){
        try{
            userRepositoty.delete(name);
        }catch (Exception e){
            System.out.println(e);
            RestResponse rsp=new RestResponse(new Long(1),"failed");
            return rsp;
        }
        RestResponse rsp=new RestResponse(new Long(0),"success");
        return rsp;
    }

}