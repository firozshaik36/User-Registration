package com.bridgelabz.userregistrationjunit;

import com.bridgelabz.userregistrationjunit.UserValidationException.ExceptionType;


/**
 * User Need To Enter Valid First Name , Last Name , Email , Mobile NUmber and
 * PassWord For User Registration.
 *
 * @author firoz
 *
 * Date : 28-04-2022
 */

@FunctionalInterface
interface UserDetailsValidationIF {
    public boolean validate(String x) throws UserValidationException;
}

// Using lambda Function
public class UserValidation {

    UserDetailsValidationIF validateName = name -> {

        try {
            if (name.length() == 0) {
                throw new UserValidationException(ExceptionType.ENTERED_EMPTY,"Please Enter Valid Name. EMPTY Name Entered.");
            }
            String nameRegex = "^[A-Z]{1}[a-z]{2,}$";
            return name.matches(nameRegex);

        }
        catch (NullPointerException e) {
            throw new UserValidationException(ExceptionType.ENTERED_NULL,"Please Enter Valid Name. NULL Name Entered.");
        }
    };


    UserDetailsValidationIF validateEmail = email ->{

        try {
            if (email.length() == 0) {
                throw new UserValidationException(ExceptionType.ENTERED_EMPTY,"Please Enter Valid Email Address. EMPTY Email Address Entered.");
            }
            String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
            return email.matches(emailRegex);
        }
        catch (NullPointerException e) {
            throw new UserValidationException(ExceptionType.ENTERED_NULL,"Please Enter Valid Email Address. NULL Email Address Entered.");

        }
    };

    UserDetailsValidationIF validateMobileNumber = mobileNumber -> {

        try {
            if (mobileNumber.length() == 0) {
                throw new UserValidationException(ExceptionType.ENTERED_EMPTY,"Please Enter Valid Mobile Number. EMPTY Mobile Number Entered.");
            }
            String mobileNumberRegex = "^[0-9]{1,2}\\s{1}[0-9]{10}$";
            return mobileNumber.matches(mobileNumberRegex);
        }
        catch (NullPointerException e) {
            throw new UserValidationException(ExceptionType.ENTERED_NULL,"Please Enter Valid Mobile Number. NULL Mobile Number Entered.");
        }
    };

    UserDetailsValidationIF validatePassword = password -> {

        try {
            if (password.length() == 0) {
                throw new UserValidationException(ExceptionType.ENTERED_EMPTY,"Please Enter Valid Password. EMPTY Password Entered.");
            }
            String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.{8,}$)[a-zA-Z0-9]*[@#$%^&-+=()][a-zA-Z0-9]*$";
            return password.matches(passwordRegex);

        } catch (NullPointerException e) {
            throw new UserValidationException(ExceptionType.ENTERED_NULL,"Please Enter Valid Password. NULL Password Entered.");
        }
    };


}