package com.bridgelabz.regex;

import java.util.regex.Pattern;

public class CheckValid {

    public static final String NAME_PATTERN = "^[A-z][a-z]{3,}$";

    public boolean validFirstName(String name){
        return Pattern.matches(NAME_PATTERN,name);
    }
}
