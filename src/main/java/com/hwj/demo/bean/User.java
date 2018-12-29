package com.hwj.demo.bean;

import org.springframework.stereotype.Component;

/**
 * @author 贺文杰
 * 2018/12/25 9:23
 */
@Component
public class User {
    private  Integer id;
    private  String username;
    private  String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
