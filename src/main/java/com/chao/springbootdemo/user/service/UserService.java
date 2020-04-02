package com.chao.springbootdemo.user.service;

import com.chao.springbootdemo.user.entities.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<User> getAll(Map map);

    void delById(Integer id);

    void save(User user);

    User getUserById(Integer id);

    void update(User user);
}
