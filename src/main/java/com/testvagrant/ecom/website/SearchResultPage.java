package com.testvagrant.ecom.website;

import com.testvagrant.ecom.base.TestBase;
import com.testvagrant.ecom.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class SearchResultPage extends TestBase {

    @FindBy(xpath= "//a[@class='full-width-link'][1]")
    WebElement selectItem;

    public SearchResultPage(){
        PageFactory.initElements(driver, this);
    }


    public ProductPage searchProduct(){
        selectItem.isDisplayed();
        selectItem.click();
        TestUtil.captureScreenshot("Search item clicked");

        return new ProductPage();
    }
}
