package com.sprint3.step_definitions;

import com.sprint3.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStep {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        LoginPage loginPage=new LoginPage();
        loginPage.Login();

    }




    @Then("Verify the user")
    public void verify_the_user() {
    String actualResult= new LoginPage().VerifyUser();
    String expectedResult= "hr1@cybertekschool.com";
        Assert.assertEquals(expectedResult,actualResult);

    }
}
