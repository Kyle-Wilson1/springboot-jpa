package com.test.User;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {
    @Id
    private long id;
    private String name;
    private long age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }
}