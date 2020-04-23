package website;

import com.testvagrant.ecom.base.TestBase;
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

    }



    public HomePage enterPassword(String password){
        if (passwordField.isDisplayed() == true) {
            passwordField.sendKeys(password);
        }
        enterButton.click();

        return new HomePage();
    }


}
