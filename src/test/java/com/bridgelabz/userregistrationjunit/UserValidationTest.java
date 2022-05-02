package com.bridgelabz.userregistrationjunit;


import org.junit.Assert ;
import org.junit.Test;

import com.bridgelabz.userregistrationjunit.UserValidation;

public class UserValidationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {

        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validateName("Firoz");
        Assert.assertTrue(isValid);

    }

    @Test
    public void givenFirstName_WhenFirstLetterIsSmall_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName("firoz");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenFirstName_WhenLesserThanThreeCharacters_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName("Fi");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {

        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validateName("Shaik");
        Assert.assertTrue(isValid);

    }

    @Test
    public void givenLastName_WhenFirstLetterIsSmall_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName("shaik");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenLastName_WhenLesserThanThreeCharacters_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName("Sh");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenEmailAddress_WhenProper_ShouldReturnTrue() {

        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validateEmail("firozshaik@gmail.com");
        Assert.assertTrue(isValid);

    }

    @Test
    public void givenEmailAddress_WhenNotProper_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateEmail("abc()*@gmail.com");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {

        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validateMobileNumber("91 9485736453");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenMobileNumber_WhenNoSpace_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateMobileNumber("919485736453");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenMobileNumber_WhenNumberLessThanTenDigits_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateMobileNumber("91 5736453");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {

        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validatePassword("firozshaik@sk11");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenPassword_WhenLessThanEightCharcters_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validatePassword("sd@A12");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenPassword_WhenNoUpperCaseCharacter_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validatePassword("asjd23$df");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenPassword_WhenNoNumericalNumber_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validatePassword("asjdAG$df");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenPassword_WhenMoreThanOneSpecialCharacter_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validatePassword("asjd23^$df");
        Assert.assertFalse(isNotValid);
    }

}