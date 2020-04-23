package testcase;

//import org.junit.jupiter.api.Test;
import com.testvagrant.ecom.website.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.testvagrant.ecom.base.TestBase;
import org.testng.annotations.Test;
import com.testvagrant.ecom.website.*;
import com.testvagrant.ecom.pricing.*;


public class TestCase extends TestBase{
    public WebDriver currentDriver;

    static LoginPage loginPage;
    static HomePage homePage;
    static SearchResultPage searchResultPage;
    static ProductPage productPage;
    static ViewCartPage viewCartPage;
    static AddQuantityPage addQuantityPage;
    static ValidatePrice validatePrice;
    static FeaturedCollectionPage featuredCollectionPage;
    static SelectSizePage selectSizePage;

    @BeforeTest
    public void setDriver(){
        currentDriver=initialization();
        driver.get("http://ecom-optimus.myshopify.com");
        loginPage = new LoginPage();
        loginPage.validatePasswordbuttondisplayed();
        loginPage.enterPassword("idgad");
    }


    @Test
    public void searchAndPriceProduct()
    {

//
//        homePage = new HomePage();
//        homePage.validateSearchIconisDisplayed();
//        homePage.searchByItemName("RoundNeck Shirt 14");
//
//        searchResultPage=new SearchResultPage();
//        searchResultPage.searchProduct();;
//
//        productPage=new ProductPage();
//        productPage.addToCart();
//
//        viewCartPage=new ViewCartPage();
//        viewCartPage.viewCart();
//
//        addQuantityPage=new AddQuantityPage();
//        addQuantityPage.setAddQuantity("2");
//
//        validatePrice=new ValidatePrice();
//        validatePrice.calculatePrice();




    }

    @Test
    public void selectFromFeaturedCollection(){

        featuredCollectionPage=new FeaturedCollectionPage();
        featuredCollectionPage.selectProduct();

        selectSizePage=new SelectSizePage();
        selectSizePage.selectSize();

        productPage=new ProductPage();
        productPage.addToCart();

        viewCartPage = new ViewCartPage();
        viewCartPage.viewCart();


    }

    @AfterTest
    public void endSession()
    {
        driver.quit();
    }



}
