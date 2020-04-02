package com.chao.springbootdemo.user.dao;

import com.chao.springbootdemo.user.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {

    List<User> getAll(@Param("content") Map map);

    void delById(Integer id);

    void save(User user);

    User getUserById(Integer id);

    void update(User user);

}
