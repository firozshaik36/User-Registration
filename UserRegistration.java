package com.bridgelabz.regex;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * User Need To Enter Valid First Name , Last Name , Email , Mobile NUmber and
 * PassWord For User Registration.
 *
 * @author firoz
 *
 * Date : 28-04-2022
 */


class Student{

    public static Logger logger = Logger.getLogger(Student.class);

    //variables
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private String passWord;

    //Created object for checkValid Class
    static  CheckValid checkValid = new CheckValid();

    // Created Getters and Setters For Variables
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        //if Condition for Checking Enterd firstName is Valid or Not
        if (checkValid.validFirstName(firstName)) {
            this.firstName = firstName;
            logger.info("Valid");
        }else
            logger.info("First Name Should Start With Capital Letter and has Minimum Three Characters");
            System.out.println();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        //if Condition for Checking Enterd LastName is Valid or Not
        if (checkValid.validLastName(lastName)) {
            this.lastName = lastName;
            logger.info("Valid");
        }else
            logger.info("Last Name Should Start With Capital Letter and has Minimum Three Characters");
        System.out.println();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        //if Condition for Checking Enterd EMail is Valid or Not
        if (checkValid.validEmail(email)) {
            this.email = email;
            logger.info("Valid");
        }else
            logger.info("Entered Email is an InValid");
            System.out.println();
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        //if Condition for Checking Enterd MobileNumber is Valid or Not
        if (checkValid.validMobileNumber(mobileNumber)) {
            this.mobileNumber = mobileNumber;
            logger.info("Valid");
        }else
            logger.info("Entered Mobile Number is an InValid");
    }

    public void setPassWord(String passWord) {
        if(checkValid.validpassWord(passWord)) {
            this.passWord = passWord;
            logger.info("Valid");
        }else
            logger.info("Password Should Be Minimum Eight Characters and have Atleast one Upper Case.");
    }
}

public class UserRegistration {

    //Main Method
    public static void main(String[] args) {

        BasicConfigurator.configure();
        // Welcome Message
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To User Registration.");
        System.out.println();

        // Taking Input From User
        Student student = new Student();
        System.out.println("Enter Your First Name:");
        student.setFirstName(sc.nextLine());
        System.out.println("Enter Your Last Name:");
        student.setLastName(sc.nextLine());
        System.out.println("Enter Your Email");
        student.setEmail(sc.nextLine());
        System.out.println("Enter Your Mobile Number");
        student.setMobileNumber(sc.nextLine());
        System.out.println("Enter Your Password");
        student.setPassWord(sc.nextLine());
    }
}
