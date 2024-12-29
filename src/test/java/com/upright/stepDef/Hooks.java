package com.upright.stepDef;

import com.upright.utility.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class Hooks {

    @Before
    public void appInit() throws IOException, InterruptedException {
        try {
            BaseClass.setDriver();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }



    @After
    public void tearDown(){
        // driver.close(), driver.quit()
        // BaseClass.getDriver().quit();
    }
}
