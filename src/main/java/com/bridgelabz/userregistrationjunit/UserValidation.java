package com.bridgelabz.userregistrationjunit;

public class UserValidation {

    public boolean validateName(String name) {

        String nameRegex = "^[A-Z]{1}[a-z]{2,}$";
        return name.matches(nameRegex);
    }

    public boolean validateEmail(String email) {

        String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
        return email.matches(emailRegex);
    }

    public boolean validateMobileNumber(String mobileNumber) {

        String mobileNumberRegex = "^[0-9]{1,2}\\s{1}[0-9]{10}$";
        return mobileNumber.matches(mobileNumberRegex);
    }

    public boolean validatePassword(String password) {

        String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.{8,}$)[a-zA-Z0-9]*[@#$%^&-+=()][a-zA-Z0-9]*$";
        return password.matches(passwordRegex);
    }
}