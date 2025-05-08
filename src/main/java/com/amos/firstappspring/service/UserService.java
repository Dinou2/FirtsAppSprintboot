package com.amos.firstappspring.service;

import com.amos.firstappspring.Repository.UserRepository;
import com.amos.firstappspring.entity.Location;
import com.amos.firstappspring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser(){
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public Optional<User> getUsed(String id){
        return userRepository.findById(id);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(User user, String id) {
        userRepository.save(user);
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    public List<User> getUsersByLocation(String id) {
        List<User> users = new ArrayList<>();
        userRepository.findByLocationId(id).forEach(users::add);
        return users;
    }
}
