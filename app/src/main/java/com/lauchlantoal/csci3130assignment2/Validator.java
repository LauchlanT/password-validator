package com.lauchlantoal.csci3130assignment2;

public class Validator {

    public Validator(){

    }

    public int validate(String password){
        int passed = 0;
        if(password == null){
            password = "";
        }
        if(!password.toUpperCase().equals("PASSWORD")){
            passed++;
        }
        if(password.length() >= 8){
            passed++;
        }
        return passed;
    }

}
