package com.testvagrant.ecom.util;

import com.testvagrant.ecom.base.TestBase;
import org.apache.velocity.texen.util.FileUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;


import java.io.File;
import java.io.IOException;

public class TestUtil extends TestBase {
    public static long PAGE_LOAD_TIMEOUT=20;
    public static long IMPLICIT_WAIT=10;

    public static void captureScreenshot(String screenshotName){
        try {
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
            FileHandler.copy(source, new File("./screenshots/"+screenshotName+".png"));
        }
        catch (Exception e){
            System.out.println("Exception while taking screenshot"+e.getMessage());

        }


    }
}
