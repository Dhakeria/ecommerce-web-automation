package com.testvagrant.ecom.website;

import com.testvagrant.ecom.base.TestBase;
import com.testvagrant.ecom.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(id = "Password")
    WebElement passwordField;

    @FindBy(xpath= "//a[@class='js-modal-open-login-modal link--action btn btn--secondary']")
    WebElement passwordButton;

    @FindBy(xpath = "//button[@class='btn btn--narrow']")
    WebElement enterButton;

    public LoginPage(){
        PageFactory.initElements(driver, this);

    }

    public void validatePasswordbuttondisplayed(){
        passwordButton.isDisplayed();
        passwordButton.click();
        TestUtil.captureScreenshot("password button clicked");

    }



    public HomePage enterPassword(String password){
        if (passwordField.isDisplayed() == true) {
            passwordField.sendKeys(password);
            TestUtil.captureScreenshot("password is entered");
        }
        enterButton.click();
        TestUtil.captureScreenshot("Enter button clicked");

        return new HomePage();
    }


}
