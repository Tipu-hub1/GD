package com.upright.stepDef;

import com.upright.utility.BaseClass;
import io.cucumber.java.en.Given;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class BackGroundSteps {


    @Given("The profile link is loaded in the browser")
    public void the_profile_link_is_loaded_in_the_browser() throws IOException {
        BaseClass.getDriver().get("http://sadiahera.click");
        // How to capture screehshot --
        TakesScreenshot ss = (TakesScreenshot) BaseClass.getDriver();
        File memoryLocation = ss.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(memoryLocation, new File("/Users/bashiruddin/Documents/Batch-7/finalProjectB7/src/test/ScreenShotFolder/browser1.png"));
    }



    @Given("the Forum login Page is open")
    public void the_forum_login_page_is_open() throws IOException {
        BaseClass.getDriver().get("https://uprightforum.tech/login/");
        BaseClass.getDriver().manage().window().maximize();
        // How to capture screehshot --
        TakesScreenshot ss = (TakesScreenshot) BaseClass.getDriver();
        File memoryLocation = ss.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(memoryLocation, new File("/Users/bashiruddin/Documents/Batch-7/finalProjectB7/src/test/ScreenShotFolder/browser1.png"));


    }

    @Given("the forum practice page is open")
    public void the_forum_practice_page_is_open() throws InterruptedException {
        BaseClass.getDriver().get("https://uprightforum.tech/practice/");
        BaseClass.getDriver().manage().window().maximize();
        Thread.sleep(3000);
    }

}
