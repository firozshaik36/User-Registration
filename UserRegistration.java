package com.bridgelabz.regex;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * User Need To Enter Valid First Name For User Registration
 *
 * @author firoz
 *
 * Date : 28-04-2022
 */


class Student{

    public static Logger logger = Logger.getLogger(Student.class);

    //variable
    private String firstName;

    //Created object for checkValid Class
    static  CheckValid checkValid = new CheckValid();

    // Created Getters and Setters For Variable firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        //if Condition for Checking Enterd firstName is Valid r Not
        if (checkValid.validFirstName(firstName)) {
            this.firstName = firstName;
            logger.info("Valid");
        }else
            logger.info("First Name Should Start With Capital Letter and has Minimum Three Characters");
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

        // Taking Input From Uer
        Student student = new Student();
        System.out.println("Enter Your First Name:");
        student.setFirstName(sc.next());
    }
}
