package com.example.training.demo.BusinessLogic;

import com.example.training.demo.Models.USERDATA;

public class BusinessLogic {
    public String getUser(String username , String password){
        try {
            if(username.equals("chickenmew") && password.equals("mewmewmaki123")){
                return "Login success Hello : "+username;
            }

        }catch(Exception ex){
            return ex.getMessage();
        }
        return "Nothing Happen";
    }
}
