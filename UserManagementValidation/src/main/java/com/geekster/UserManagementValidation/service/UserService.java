package com.geekster.UserManagementValidation.service;

import com.geekster.UserManagementValidation.model.UserModel;
import com.geekster.UserManagementValidation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String addUser(UserModel userModel) {
        boolean status=userRepository.save(userModel);
        if(status){
            return "user added successfully";
        }
        else{
            return "user added not successfully";
        }
    }

    public ArrayList<UserModel> getAllUser() {
        return userRepository.getAllUser();
    }

    public UserModel getIdByUser(Integer userId) {
        ArrayList<UserModel>helperList=getAllUser();
        UserModel matchingUser=null;
        for(UserModel user:helperList){
            if(user.getUserId()==userId){
                matchingUser=user;
                break;
            }
        }
        return matchingUser;
    }

    public String updateUser(Integer userId, UserModel userModel) {
    boolean updateStatus=userRepository.updateUserId(userId,userModel);
      if(updateStatus){
          return "userDetails updated successfully....!!!";
      }
      else{
        return  "userDetails not updated successfully....!!!";
      }
    }

    public String deleteUserById(Integer userId) {
        ArrayList<UserModel> helperList = getAllUser();
        for (UserModel user : helperList) {
            if (user.getUserId() == userId) {
                helperList.remove(user);
                return "userId deleted successfully.....!!!";
            }
        }
        return "userId not found .....!!!";
    }
}
