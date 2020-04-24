package com.testvagrant.ecom.website;

import com.testvagrant.ecom.base.TestBase;
import com.testvagrant.ecom.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeaturedCollectionPage extends TestBase {
    @FindBy(xpath="//a[@class='grid-view-item__link grid-view-item__image-container full-width-link'][1]")
    WebElement product;



    public FeaturedCollectionPage(){
        PageFactory.initElements(driver, this);
    }

    public void selectProduct(){
        product.isDisplayed();
        product.click();
        TestUtil.captureScreenshot("Product clicked");

    }
}
