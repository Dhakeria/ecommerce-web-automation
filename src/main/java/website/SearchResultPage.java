package website;

import com.testvagrant.ecom.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

        return new ProductPage();
    }
}
