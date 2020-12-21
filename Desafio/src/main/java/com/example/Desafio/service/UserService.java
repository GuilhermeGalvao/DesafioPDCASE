package com.example.Desafio.service;

import com.example.Desafio.entities.User;
import com.example.Desafio.exceptions.UserNotFoundException;
import com.example.Desafio.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

public class UserService {

    @Autowired
    private UserRepository userRepositorie;


    public UserService(){

    }

    public List<User> findAll() {
        return userRepositorie.findAll();
    }

    public User getUser(Integer request_id){
        Optional<User> user = userRepositorie.findById(request_id);
        if(user.isPresent() ){
            return user.get();
        }
        return null;
    }




    public User get(Integer request_id) {
        Optional<User> user = userRepositorie.findById(request_id);
        if(user.isPresent()){
            return user.get();
        }
        return null;
    }


    public User save(User data) {
        return userRepositorie.saveAndFlush(data);
    }

    public User update(Integer id, User user){
        Optional<User> userRequested = userRepositorie.findById(id);
        if (!userRequested.isPresent())
            return null;
        user.setId(id);
        userRepositorie.save(user);
        return user;
    }

    public String delete(Integer id){
        try{
            userRepositorie.deleteById(id);
            return "Deleted";
        }catch (Exception e) {
            throw new UserNotFoundException("USER NOT FOUND");
        }
    }




}
