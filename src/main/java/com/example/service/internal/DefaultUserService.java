package com.example.service.internal;

import com.example.model.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017-03-16.
 */
@Service
public class DefaultUserService implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(String id) {
        User user = repository.findOne(id);
        return user;
    }
}
