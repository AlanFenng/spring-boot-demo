package com.example.repository;

import com.example.model.User;

/**
 * Created by Administrator on 2017-03-16.
 */
public interface UserRepository {

    User findOne(String id);
}
