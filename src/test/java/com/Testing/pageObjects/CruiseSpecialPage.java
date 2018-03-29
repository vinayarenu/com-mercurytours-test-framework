package com.Testing.pageObjects;

import com.Testing.helpers.BasePage;
import org.openqa.selenium.By;

public class CruiseSpecialPage extends BasePage {
    public void selectCruise(){
        driver.findElement(By.linkText("Cruises")).click();

    }

    public String isOnCruiseSpecialPage(){
        return driver.getCurrentUrl();
    }
}
