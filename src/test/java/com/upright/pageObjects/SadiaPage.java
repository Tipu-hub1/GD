package com.upright.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SadiaPage {

    // Constructor
    // Page Object (Web element)
    // Method according to actions

    // Page Factory from Selenium --- this class will remember all the page elements and
    // will transfer those to the step def class
    public SadiaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



//WebElement firstName = driver.findElemnt(By.xpath())

    @FindBy(xpath = "//input[@id='Project management tool']")
    WebElement projectInputBox;

    @FindBy(xpath = "//input[@name = 'Documentation tool']")
    WebElement documentaitonInputBox;

    @FindBy(xpath = "//lable[text() = ' Documentation tool :']")
    WebElement documentationlabel;

    public void projectManagementTool(){
        projectInputBox.sendKeys("JIRA");
    }


    public void labelDocumentaiton(){
    String mydocText =    documentationlabel.getText();
        System.out.println(mydocText);
    }


    public void documentationTool(){
        documentaitonInputBox.sendKeys("Confluence");
    }


}
