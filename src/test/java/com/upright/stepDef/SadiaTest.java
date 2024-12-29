package com.upright.stepDef;

import com.upright.pageObjects.SadiaPage;
import com.upright.utility.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SadiaTest {

    SadiaPage obj;


    @When("user get the input box")
    public void user_get_the_input_box(){
        obj = new SadiaPage(BaseClass.getDriver());
    }


    @Then("the user user should be able to type the tool name")
    public void the_user_user_should_be_able_to_type_the_tool_name(){
        obj.projectManagementTool();
    }


    @When("user get the documentation label")
    public void user_get_the_documentation_label() {
        obj.labelDocumentaiton();
    }


    @Then("the user user should be able to type the documentation tool name")
    public void the_user_user_should_be_able_to_type_the_documentation_tool_name() {
obj.documentationTool();
    }


}
