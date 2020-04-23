package testcase;

//import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.testvagrant.ecom.base.TestBase;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import website.*;


public class TestCase extends TestBase{
    public WebDriver currentDriver;

    static LoginPage loginPage;
    static HomePage homePage;
    static SearchResultPage searchResultPage;
    static ProductPage productPage;
    static ViewCartPage viewCartPage;
    static AddQuantityPage addQuantityPage;

    @BeforeTest
    public void setDriver(){
        currentDriver=initialization();
    }


    @Test
    public void VerfiyDetails()
    {
        driver.get("http://ecom-optimus.myshopify.com");
        loginPage = new LoginPage();
        loginPage.validatePasswordbuttondisplayed();
        loginPage.enterPassword("idgad");

        homePage = new HomePage();
        homePage.validateSearchIconisDisplayed();
        homePage.searchByItemName("RoundNeck Shirt 14");

        searchResultPage=new SearchResultPage();
        searchResultPage.searchProduct();;

        productPage=new ProductPage();
        productPage.addToCart();

        viewCartPage=new ViewCartPage();
        viewCartPage.viewCart();

        addQuantityPage=new AddQuantityPage();
        addQuantityPage.addQuantity("2");
        addQuantityPage.priceOfProduct();
        addQuantityPage.pop();


    }

    @AfterTest
    public void endSession()
    {
        driver.quit();
    }



}
