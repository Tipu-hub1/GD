package com.upright.pageObjects;

import org.jsoup.internal.FieldsAreNonnullByDefault;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ForumLoginPage {

    public ForumLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//a[text() = 'Log In']")
    WebElement LoginPagePath;

    public void logInPage(){
       boolean loginPageisDisplayed =  LoginPagePath.isDisplayed();
       // Assert.assertEquals(loginPageisDisplayed, false, "login page is not available");

        if(loginPageisDisplayed==true){
           // System.out.println("The page is available");
        }
        else {
            System.out.println("this page is not avaialble");
        }
    }



    @FindBy(xpath = "// input[@name = 'username-44']")
    WebElement userNamePath;

            public void enterUserName(){
                userNamePath.sendKeys("TestUser");
            }


            @FindBy(xpath = "//input[@id = 'user_password-44']")
    WebElement passwordPath;

            public void enterPassword(){
                passwordPath.sendKeys("Test@123");
            }


            @FindBy(xpath = "// input[@id = 'um-submit-btn']")
    WebElement loginButtonPath;

            public void clickOnLogin(){
                loginButtonPath.click();
            }

            @FindBy(xpath = "//span[contains(text(), 'Upright')]")
    WebElement homepageName;

            public void validateHomePage(){
            boolean homePageVerify =    homepageName.isDisplayed();

            if(homePageVerify==true){
               // System.out.println("I am in the home page");
            }
            else {
                System.out.println("I am not in the home Page");
            }
            }

}
