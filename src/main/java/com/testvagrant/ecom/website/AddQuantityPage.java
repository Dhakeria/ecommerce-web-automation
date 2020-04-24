package com.testvagrant.ecom.website;

import com.testvagrant.ecom.base.TestBase;
import com.testvagrant.ecom.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.json.JsonOutput;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class AddQuantityPage extends TestBase {
    public static String count;
    @FindBy(id= "updates_large_32250535018605:48df27cef94841c8e13039a54ff22744")
    WebElement quantityField;

    @FindBy(xpath= "//td[@class='cart__price text-right']")
    WebElement priceText;



    public AddQuantityPage(){
        PageFactory.initElements(driver, this);
    }


    public void setAddQuantity(String newCount){
        this.count=newCount;
        quantityField.clear();
        quantityField.sendKeys(count);
        TestUtil.captureScreenshot("Adding count");
    }


    public String getAddQuantity(){
        return this.count;
    }




    public String priceOfProduct(){

        String productprice = priceText.getText()
                .replaceAll("([a-z])", "")
                .replaceAll("([A-Z])", "")
                .replaceAll("(,)", "")
                .replace(" ", "")
                .replaceFirst(".","");
        return productprice;


    }

}
