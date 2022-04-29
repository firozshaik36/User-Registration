package com.bridgelabz.regex;

import java.util.regex.Pattern;

public class CheckValid {


    public static final String NAME_PATTERN = "^[A-Z][a-z]{3,}$"; //Name Pattern
    public static final String EMAIL_PATTERN = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
    public static final String NUMBER_PATTERN = "^[0-9]{2}[\\s][0-9][0-9]{9}$"; //Number Pattern
    public static final String PASSWORD_PATTERN = "^[a-z]{8,}$";//PassWord Pattern

    //Methods
    public boolean validFirstName(String name) {
        return Pattern.matches(NAME_PATTERN, name);
    }

    public boolean validLastName(String name) {
        return Pattern.matches(NAME_PATTERN, name);
    }

    public boolean validEmail(String email) {
        return Pattern.matches(EMAIL_PATTERN, email);
    }

    public boolean validMobileNumber(String mobileNumber) {
        return Pattern.matches(NUMBER_PATTERN, mobileNumber);
    }

    public boolean validpassWord(String passWord){
        return Pattern. matches(PASSWORD_PATTERN, passWord);
    }
}