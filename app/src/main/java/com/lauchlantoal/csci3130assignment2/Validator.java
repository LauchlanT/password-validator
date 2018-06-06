package com.lauchlantoal.csci3130assignment2;

/**
 * A class for validating passwords.
 */
public class Validator {

    /**
     * The constructor for the Validator class.
     */
    public Validator(){

    }

    /**
     * Checks a string against different rules to determine the strength of the password.
     *
     * @param password Accepts a string as the password to validate.
     * @return Returns an int representing the number of requirements the password meets.
     */
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
        if(!password.toUpperCase().equals(password) && !password.toLowerCase().equals(password)){
            passed++;
        }
        for(int i = 0; i < password.length(); i++){
            if(Character.isDigit(password.charAt(i))){
                passed++;
                break;
            }
        }
        int nonDigitCount = 0;
        for(int i = 0; i < password.length(); i++){
            if(!Character.isDigit(password.charAt(i))){
                if(++nonDigitCount >= 4){
                    passed++;
                    break;
                }
            }
        }
        return passed;

    }

}
