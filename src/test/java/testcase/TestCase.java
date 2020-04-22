package testcase;

//import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.testvagrant.ecom.base.TestBase;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestCase extends TestBase{
    public WebDriver currentDriver;

    @BeforeTest
    public void setDriver(){
        currentDriver=initialization();
    }


    @Test
    public void VerfiyDetails()
    {
        driver.get("http://ecom-optimus.myshopify.com");
    }

    @AfterTest
    public void endSession()
    {
        driver.quit();
    }



}
