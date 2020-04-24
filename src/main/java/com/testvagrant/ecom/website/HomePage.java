package com.testvagrant.ecom.website;

import com.testvagrant.ecom.base.TestBase;
import com.testvagrant.ecom.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    @FindBy(name = "q")
    WebElement searchbar;

    @FindBy(xpath= "//button[@class='btn--link site-header__icon site-header__search-toggle js-drawer-open-top' ]")
    WebElement searchIcon;

    @FindBy(xpath = "//button[@class='search-bar__submit search-form__submit']")
    WebElement searchbutton;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public void validateSearchIconisDisplayed(){
        searchIcon.isDisplayed();
        searchIcon.click();
        TestUtil.captureScreenshot("Search icon clicked");

    }



    public SearchResultPage searchByItemName(String itemname){  //return type is search page
        if (searchbar.isDisplayed() == true) {
            searchbar.sendKeys(itemname);
            TestUtil.captureScreenshot("Item name is entered");
        }
        searchbutton.click();
        TestUtil.captureScreenshot("Search button clicked");

        return new SearchResultPage(); //as this method lends to search  page
    }
}
