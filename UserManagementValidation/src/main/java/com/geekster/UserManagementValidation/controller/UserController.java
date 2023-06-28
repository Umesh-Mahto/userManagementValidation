package com.geekster.UserManagementValidation.controller;

import com.geekster.UserManagementValidation.model.UserModel;
import com.geekster.UserManagementValidation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody UserModel userModel ){
        return userService.addUser(userModel);
    }
    @GetMapping("/getUser")
    public ArrayList<UserModel> getAllUser(){
        return userService.getAllUser();
    }
    @GetMapping("/user/{userId}")
    public UserModel getId( @PathVariable Integer userId){
        return userService.getIdByUser(userId);
    }
    @PutMapping("/update/{userId}")
    public String updateUser(@PathVariable Integer userId,@RequestBody UserModel userModel){
        return userService.updateUser(userId,userModel);
    }

    @DeleteMapping("/deleteUser/{userId}")
    public String deleteUserById(@PathVariable Integer userId){

        return userService.deleteUserById(userId);
      }
    }
