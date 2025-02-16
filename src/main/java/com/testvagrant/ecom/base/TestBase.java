package com.testvagrant.ecom.base;

import com.testvagrant.ecom.util.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;

    public TestBase() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("/Users/manish/Development/EComAssignment/src/main/java/com/testvagrant/ecom/config/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  WebDriver initialization(String browser)
    {
//        String browserName = prop.getProperty("browser");


        if(browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/manish/Development/EComAssignment/src/main/resources/chromedriver");
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver", "/Users/manish/drivers/geckodriver");
            driver = new FirefoxDriver();
        }
        System.out.println("Starting initialization");

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

        return driver;

    }

}




