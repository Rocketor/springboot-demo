package com.chao.springbootdemo.user.service;

import com.chao.springbootdemo.user.dao.UserDao;
import com.chao.springbootdemo.user.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAll(Map map) {
        return userDao.getAll(map);
    }

    @Override
    public void delById(Integer id) {
        userDao.delById(id);
    }

    @Override
    public void save(User user) {
        user.setGmtCreate(new Date());
        user.setStatus(1);
        userDao.save(user);
    }

    @Override
    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }
}
