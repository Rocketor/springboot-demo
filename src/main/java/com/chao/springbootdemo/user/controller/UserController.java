package com.chao.springbootdemo.user.controller;

import com.chao.springbootdemo.user.entities.User;
import com.chao.springbootdemo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<User> getAll(Map map){
        return userService.getAll(map);
    }

    @RequestMapping("/delById/{id}")
    public String delById(@PathVariable(name = "id") Integer id){
        userService.delById(id);
        return "redirect:/index.html";
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestBody User user){
        userService.save(user);
        return "注册成功";
    }

    @RequestMapping("/getUserById")
    @ResponseBody
    public User getUserById(Integer id){
        return userService.getUserById(id);
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update(@RequestBody User user){
        userService.update(user);
        return "修改成功";
    }


}
