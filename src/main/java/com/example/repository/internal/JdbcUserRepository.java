package com.example.repository.internal;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017-03-16.
 */
@Repository
public class JdbcUserRepository implements UserRepository {

    @Autowired
    @Qualifier("primaryJdbcTemplate")
    private NamedParameterJdbcOperations namedParameterJdbcOperations;

    private RowMapper<User> userRowMapper = new BeanPropertyRowMapper<>(User.class);

    private String selectUserSQL = "select id,username,password  from customers where id = ?";

    @Override
    public User findOne(String id) {
        User user = namedParameterJdbcOperations.getJdbcOperations().queryForObject(selectUserSQL, userRowMapper, id);
        return user;
    }
}
