package com.upright.pageObjects;

import com.upright.utility.BaseClass;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.Set;

public class UFPracticePage {
    Select dd;
    Actions action;
    String firstWindowid;
    JavascriptExecutor js;

    public UFPracticePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//select[@class = 'form-control']")
    WebElement DDselectPath;

    public void clickonArrow(){
        dd = new Select(DDselectPath);
    }

    public void selectAnOption() throws InterruptedException {
        dd.selectByIndex(1);
        Thread.sleep(3000);
        dd.selectByVisibleText("Option 3");
    }

    @FindBy(xpath = "//button[@class = 'btn btn-secondary dropdown-toggle mouse-over-button']")
    WebElement hoverPath;

    public void moveToHover(){
       action = new Actions(BaseClass.getDriver());
        action.moveToElement(hoverPath).build().perform();
    }

    @FindBy(xpath = "//a[text() = 'Option 2']")
    WebElement option2Path;

    public void clickonOption2(){
       //option2Path.click();
    }


    public void doubleClick() throws InterruptedException {
        action.doubleClick(option2Path).build().perform();
        Thread.sleep(5000);
    }

    public void rightClick()  {
        action.contextClick(option2Path).build().perform();

    }

    //  action.clickAndHold().dragAndDropBy(element, 500,400); -- drag and drop
        @FindBy(xpath = "//button[contains (text(), 'open window')]")
        WebElement openWindowPath;

    public void clickOpenWindowButton(){
        openWindowPath.click();
    }

    @FindBy(xpath = "//i[@class = 'fas fa-user']")
    WebElement imagePathSecondWindow;
    public void switchingToSecondWindow() throws InterruptedException {
        firstWindowid = BaseClass.getDriver().getWindowHandle();// it will give me the id of current window
        System.out.println(firstWindowid);
       Set<String> bothWindowsID = BaseClass.getDriver().getWindowHandles();
        System.out.println(bothWindowsID);
        System.out.println(bothWindowsID.size());

        for (String b: bothWindowsID){
            if(!b.equalsIgnoreCase(firstWindowid)){
                BaseClass.getDriver().switchTo().window(b);
            }
        }

        Thread.sleep(5000);
        imagePathSecondWindow.click();
        BaseClass.getDriver().close(); // it will close the second window (Current window)
    }

@FindBy(xpath = "//div[@id='expander']")
WebElement clickitpathFirstWindow;

    @FindBy(xpath = "//a[text() = 'Notices']")
    WebElement noticePathFirstWindow;
    public void returningToFirstWindow() throws InterruptedException {
        BaseClass.getDriver().switchTo().window(firstWindowid);
        Thread.sleep(5000);

       // noticePathFirstWindow.click();
//
    Actions action = new Actions(BaseClass.getDriver());
    action.doubleClick(clickitpathFirstWindow).build().perform();

    //clickitpathFirstWindow.click();
    }


//    @FindBy(xpath = "//button[text() = 'Click Here']")
//    WebElement clickHerePath;
    @FindBy(xpath = "//p[text() = 'Api Testing']")
    WebElement apiTestingPath;

    public void clickHere(){
     List<WebElement>list1 =  BaseClass.getDriver().findElements(By.xpath("//button[text() = 'Click Here']"));
        boolean isemptyorNot = list1.isEmpty(); // boolean value
        Assert.assertEquals(isemptyorNot, false);
        list1.get(0).click();
        // polling time....
        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), 2);
        wait.until(ExpectedConditions.visibilityOf(apiTestingPath));

        /*
        How many types of wait you know/have worked on
        1. Implicitly wait --
        2. Explictly wait
             i. WebDriverWait
                    conditions  i. elementtobevisible
                                ii. Alerttobepresent
                                iii. frametobeavailble
                                iv. windowispresent
                                v. visibilityofelemnet
             ii. Fluent Wait
         */



    }


    public void switchToUprightAutomationPage(){
        /* How many types of frame
        two types i.frame  ii. inline frame
         */
        BaseClass.getDriver().switchTo().frame(0);

    }



    public void scrollDown(){
        js = (JavascriptExecutor) BaseClass.getDriver();
       // js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
       // js.executeScript("window.scrollBy(0, 1000)");
    }


    @FindBy(xpath = "//a[@title = 'Travel & Hotel']")
    WebElement traveHotelPath;

    public void findElementUsingScrollDown(){
        js.executeScript("arguments[0].scrollIntoView();", traveHotelPath);
    }
}
