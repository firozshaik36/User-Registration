package com.bridgelabz.userregistrationjunit;

public class UserValidation {

    public boolean validateName(String name) {

        if(name == null) {
            return false;
        }
        if(name == "") {
            return false;
        }
        String nameRegex = "^[A-Z]{1}[a-z]{2,}$";
        return name.matches(nameRegex);
    }

    public boolean validateEmail(String email) {

        if(email == null) {
            return false;
        }
        if(email == "") {
            return false;
        }
        String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
        return email.matches(emailRegex);
    }

    public boolean validateMobileNumber(String mobileNumber) {

        if(mobileNumber == null) {
            return false;
        }
        if(mobileNumber == "") {
            return false;
        }
        String mobileNumberRegex = "^[0-9]{1,2}\\s{1}[0-9]{10}$";
        return mobileNumber.matches(mobileNumberRegex);
    }

    public boolean validatePassword(String password) {

        if(password == null) {
            return false;
        }
        if(password == "") {
            return false;
        }
        String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.{8,}$)[a-zA-Z0-9]*[@#$%^&-+=()][a-zA-Z0-9]*$";
        return password.matches(passwordRegex);
    }

}