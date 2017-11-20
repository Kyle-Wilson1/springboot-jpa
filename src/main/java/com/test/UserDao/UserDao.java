package com.test.UserDao;

import com.test.User.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.*;
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

    //@Query("select t from User t")
    List<User> findAll();

    @Modifying(clearAutomatically = true)
    @Query("update User u set u.age = :age where u.name = :name")
    int updateAgeByName(@Param("name") String name, @Param("age") Long age);

    User save(User user);

    @Modifying(clearAutomatically = true)
    @Query(value="delete from User where name =:name",nativeQuery=true)
    void delete(@Param("name") String name);
}