package com.upright.stepDef;

import com.upright.pageObjects.ForumLoginPage;
import com.upright.utility.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.jsoup.Connection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForumLoginTest {

    ForumLoginPage obj;



    @Given("Login page is available")
    public void login_page_is_available() {
        obj = new ForumLoginPage(BaseClass.getDriver());
        obj.logInPage();
    }

    @When("User enter his username")
    public void user_enter_his_username() {
        obj.enterUserName();
    }

    @When("Use enter his password")
    public void use_enter_his_password() {
obj.enterPassword();
    }

    @When("User click on login button")
    public void user_click_on_login_button() {
    obj.clickOnLogin();
    }

    @Then("Verify that User should be navigated to the home page")
    public void user_should_be_navigated_to_the_home_page() {
        obj.validateHomePage();
    }

    @When("User enter his {string}")
    public void user_enter_his(String userName) throws InterruptedException {
     BaseClass.getDriver().findElement(By.xpath("//input[@name = 'username-44']")).sendKeys(userName);
     Thread.sleep(3000);
    }

    @When("Use enter his {string}")
    public void use_enter_his(String password) {
    BaseClass.getDriver().findElement(By.xpath("//input[@name = 'user_password-44']")).sendKeys(password);
    }

    @Then("Verify that User should receive an error msg")
    public void verify_that_user_should_receive_an_error_msg() throws InterruptedException {
        Thread.sleep(3000);

    try{
        WebElement element1 = BaseClass.getDriver().findElement(By.xpath("//div[@id = 'um-error-for-user_password-44']"));
        String passwordIncorrectText =  element1.getText();
        if (passwordIncorrectText.equalsIgnoreCase("Password is incorrect. Please try again.")){
            System.out.println("password is incorrect error message");

        }
        WebElement element2 = BaseClass.getDriver().findElement(By.xpath("//p[@class = 'um-notice err']"));
        String notice = element2.getText();
        if (notice.equalsIgnoreCase("Your account has not been approved yet.")) {
            System.out.println("Notice error");
        }
    }
    catch (Exception e){
        System.out.println(e);
        }


    }



}
