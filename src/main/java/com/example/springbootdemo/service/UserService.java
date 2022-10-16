package com.example.springbootdemo.service;

import com.example.springbootdemo.model.User;
import com.example.springbootdemo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findBtId(int id){
        return userRepository.getOne(id);

    }

    public List<User> findAll(){
        return userRepository.findAll();

    }

    public User saveUser(User user){
        return userRepository.save(user);

    }
    public void deleteById(int id){
        userRepository.deleteById(id);

    }
}
