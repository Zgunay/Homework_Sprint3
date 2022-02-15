package com.sprint3.pages;

import com.sprint3.utilities.ConfigurationReader;
import com.sprint3.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(name = "USER_LOGIN")
    public WebElement username;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(css = ".login-btn")
    public WebElement LoginButton;

    @FindBy(id = "user-name")
    public WebElement ProfilButton;

    @FindBy(xpath = "//td[@class='user-profile-nowrap-second']")
    public WebElement UserVerify;

    @FindBy(xpath = "//span[.='My Profile']")
    public WebElement MyProfile;



public void Login(){
    Driver.get().get(ConfigurationReader.get("url"));
    username.sendKeys(ConfigurationReader.get("username"));
    password.sendKeys(ConfigurationReader.get("password"));
    LoginButton.click();
}

public String VerifyUser(){
    ProfilButton.click();
    MyProfile.click();
    return UserVerify.getText();
}

}
