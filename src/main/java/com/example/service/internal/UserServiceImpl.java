package com.example.service.internal;

import com.example.model.User;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017-03-21.
 */
@Service(value = "UserServiceImpl")
public class UserServiceImpl implements UserService{
    @Override
    public User findById(String id) {
        return new User("12","alan","234324");
    }
}
