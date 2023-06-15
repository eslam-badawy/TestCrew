package com.stc.pages;

import org.openqa.selenium.By;
import java.io.IOException;

public class SubscriptionPage extends WebPage {
    public SubscriptionPage() throws IOException {
       
    }
    
    public static By countryDropdown = By.xpath("//span[@id='country-name']");
    
    public static By saudiCountryOption = By.xpath("//a[@id='sa']");
    
    public static By kuwaitCountryOption = By.xpath("//a[@id='kw']");
    
    public static By bahrainCountryOption = By.xpath("//a[@id='bh']");
   
    public static By subscriptionType = By.xpath("(//strong[@class='plan-title'])[2]");

    public static By subsubscriptionPrice = By.xpath("//*[@id='currency-classic']/b");
                                                                      
    public static By subsubscriptionCurrency = By.xpath("//div[@id='currency-classic']/i");


    public void clickOncountryDropdown() {
    	clickOnElement(countryDropdown);
    }
    
    public void clickOnsaudiCountryOption() {
    	clickOnElement(saudiCountryOption);
    }
    
    public void clickOnkuwaitCountryOption() {
    	clickOnElement(kuwaitCountryOption);
    }
    
    public void clickOnbahrainCountryOption() {
    	clickOnElement(bahrainCountryOption);
    }
    
    public String getsubscriptionTypeText() {
    	return getElementText(subscriptionType);
    }
    
    public String getsubsubscriptionPriceText() {
    	return getElementText(subsubscriptionPrice);
    }
    
    public String getsubsubscriptionCurrencyText() {
    	return getElementText(subsubscriptionCurrency);
    }



}
