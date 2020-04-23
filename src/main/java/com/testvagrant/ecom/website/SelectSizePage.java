package com.testvagrant.ecom.website;

import com.testvagrant.ecom.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectSizePage extends TestBase {
    @FindBy(id= "SingleOptionSelector-1")
    WebElement sizeDropDown;

    public SelectSizePage(){
        PageFactory.initElements(driver, this);
    }


    public ProductPage selectSize(){
        Select dropdown = new Select(sizeDropDown);
        dropdown.selectByValue("M");
        return new ProductPage();

    }
}
