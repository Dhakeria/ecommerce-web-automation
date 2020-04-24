package com.testvagrant.ecom.website;

import com.testvagrant.ecom.base.TestBase;
import com.testvagrant.ecom.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCartPage extends TestBase {
    @FindBy(xpath= "//a[@class='cart-popup__cta-link btn btn--secondary-accent']")
    WebElement viewCartButton;

    public ViewCartPage(){
        PageFactory.initElements(driver, this);
    }


    public AddQuantityPage viewCart(){
        viewCartButton.isDisplayed();
        viewCartButton.click();
        TestUtil.captureScreenshot("View cart is clicked");
        return new AddQuantityPage();
    }
}
