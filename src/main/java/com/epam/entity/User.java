package com.epam.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

/**
 * Created by stsym on 10/25/2016.
 */
@Entity
public class User {
    @GeneratedValue
    private Long id;
    private String name;
    private String login;

    public User(String name, String login){
        this.name = name;
        this.login = login;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
