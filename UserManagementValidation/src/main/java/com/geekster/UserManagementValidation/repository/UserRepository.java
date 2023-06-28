package com.geekster.UserManagementValidation.repository;

import com.geekster.UserManagementValidation.model.UserModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class UserRepository {
   static ArrayList<UserModel>list=new ArrayList<>();
    public boolean save(UserModel userModel) {
        list.add(userModel);
        return true;
    }

    public ArrayList<UserModel> getAllUser() {
        return list;
    }

    public boolean updateUserId(Integer userId, UserModel userModel) {
        for(UserModel userObj:list){
            if(userId==userObj.getUserId()){
                userObj.setUserId(userModel.getUserId());
                userObj.setUserName(userModel.getUserName());
                userObj.setEmail(userModel.getEmail());
                userObj.setPhoneNumber(userModel.getPhoneNumber());
                userObj.setDateOfBirth(userModel.getDateOfBirth());
                userObj.setDate(userModel.getDate());
                userObj.setTime(userModel.getTime());
                return true;
            }
        }
        return false;
    }
}
