package com.test.UserDao;

import com.test.User.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.*;

/**
 * Created by Song on 2017/2/15.
 * User表操作接口
 */
@Repository
public interface UserDao extends JpaRepository<User,Long>{

    @Query("select t from User t where t.name = :name")
    List<User> findUserByName(@Param("name") String name);

    @Query("select t from User t")
    List<User> findAll();

    User save(User user);
    void delete(User user);
}