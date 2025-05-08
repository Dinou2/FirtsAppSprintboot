package com.amos.firstappspring.controller;

import com.amos.firstappspring.entity.Location;
import com.amos.firstappspring.entity.User;
import com.amos.firstappspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }

    @RequestMapping("/users/{id}")
    public Optional<User> getUser(@PathVariable String id){
        return userService.getUsed(id);
    }

    @PostMapping("users")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @PutMapping("/users/{id}")
    public void updateUser(@RequestBody User user, @PathVariable String id){
        userService.updateUser(user, id);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable String id){
        userService.deleteUser(id);
    }
}
