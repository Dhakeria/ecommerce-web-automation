package com.testvagrant.ecom.website;

import com.testvagrant.ecom.base.TestBase;
import com.testvagrant.ecom.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends TestBase {
    @FindBy(name= "add")
    WebElement addButton;

    public ProductPage(){
        PageFactory.initElements(driver, this);
    }


    public ViewCartPage addToCart(){
        addButton.click();
        TestUtil.captureScreenshot("add button clicked");
        return new ViewCartPage();
    }
}
