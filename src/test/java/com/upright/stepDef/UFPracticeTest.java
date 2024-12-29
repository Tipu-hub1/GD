package com.upright.stepDef;

import com.upright.pageObjects.UFPracticePage;
import com.upright.utility.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UFPracticeTest {

    UFPracticePage obj;


    @Given("the page is available")
    public void the_page_is_available() {
        obj = new UFPracticePage(BaseClass.getDriver());
    }

    @When("user click on the down arrow sign")
    public void user_click_on_the_down_arrow_sign() {
        obj.clickonArrow();
    }

    @Then("he can select any option available")
    public void he_can_select_any_option_available() throws InterruptedException {
        obj.selectAnOption();
    }


    @When("user hover over on the element")
    public void user_hover_over_on_the_element() throws InterruptedException {
        Thread.sleep(3000);
        obj.moveToHover();
    }

    @Then("user can select Option2")
    public void user_can_select_option2() {
        obj.clickonOption2();
    }


    // With the help of Actions class we can do -- i. hover over, ii. Context Click(Right click)
    // double click, keyboard handling...

    @Then("user can make a right click")
    public void user_can_make_a_right_click() throws InterruptedException {
        obj.rightClick();
        Thread.sleep(5000);
    }

    @Then("user can double click")
    public void user_can_double_click() throws InterruptedException {
    obj.doubleClick();
    }


    @When("the user click on Open Window button")
    public void the_user_click_on_open_window_button() {
        obj.clickOpenWindowButton();
    }


    @Then("validate that user can switch to the second window")
    public void validate_that_user_can_switch_to_the_second_window() throws InterruptedException {
        obj.switchingToSecondWindow();
    }


    @Then("validate that use can return to the first window")
    public void validate_that_use_can_return_to_the_first_window() throws InterruptedException {
        obj.returningToFirstWindow();
    }

    @When("user click on clickhere button")
    public void user_click_on_clickhere_button() {
     obj.clickHere();
    }
    @Then("api testing text should appear")
    public void api_testing_text_should_appear() {

    }


    @Given("user switch to uprightAutomation page")
    public void use_switch_to_upright_automation_page() {
        obj.switchToUprightAutomationPage();
    }

    @When("user scroll down")
    public void user_scroll_down() {
obj.scrollDown();
    }

    @Then("user can find the element")
    public void user_can_find_the_element() {
obj.findElementUsingScrollDown();
    }

}