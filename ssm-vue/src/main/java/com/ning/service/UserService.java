package com.ning.service;

import com.ning.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(Integer id);

    void update(User user);
}
