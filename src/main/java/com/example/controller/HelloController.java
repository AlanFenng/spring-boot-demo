package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017-03-14.
 */
@RestController
public class HelloController {

    @Value("${com.example.name}")
    private String name;
    @Value("${com.example.want}")
    private String want;

    @Resource(name="UserServiceImpl")
    UserService userService;
    
    @RequestMapping("/")
    public String hello() {
        return want;
    }

    @RequestMapping("/sayHello")
    public String sayHello() {
        return "我的名字叫:" + name +". Please call me"+want;
    }

    @RequestMapping("/findUser")
    public Object findById(String id) {
        User user = userService.findById(id);
        return user;

    }
}
