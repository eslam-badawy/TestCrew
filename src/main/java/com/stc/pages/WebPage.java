package com.stc.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.stc.base.Base;

public class WebPage extends Base{

     public WebPage() throws IOException {
        super();
    }

    public void clickOnElement(By locator) {
    	WebElement element = driver.findElement(locator);
    	element.click();
    }
    
    public String getElementText(By locator) {
    	WebElement element = driver.findElement(locator);
    	return element.getText();
    }
}
