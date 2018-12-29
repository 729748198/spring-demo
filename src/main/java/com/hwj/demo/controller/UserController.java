package com.hwj.demo.controller;

import com.hwj.demo.bean.User;
import com.hwj.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 贺文杰
 * 2018/12/25 9:31
 */
@Controller
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/listUser")
    @ResponseBody
    public List<User> listUser(){
        List<User> users=userMapper.findall();

        return users;
    }
}
