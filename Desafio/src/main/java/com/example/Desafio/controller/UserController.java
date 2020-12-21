package com.example.Desafio.controller;

import com.example.Desafio.entities.User;
import com.example.Desafio.service.UserService;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "UserController", description = "REST APIs related to User Entity")
@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @ApiOperation(value = "Delete a User in the System ", response = User.class, responseContainer = "List", tags = "UserController")
    @GetMapping(value="/getAll")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Object> getAll(){
        log.info("get All Users" );

        List<User> users = userService.findAll();

        return ResponseEntity.ok().body(users);

    }
}
