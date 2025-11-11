package com.coverfox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetailsPage
{
@FindBy(className="mp-input-text")private WebElement pincodeField;
@FindBy(id="want-expert") private WebElement mobNumField;
@FindBy(className="next-btn") private WebElement continueButton;



public CoverFoxAddressDetailsPage(WebDriver driver)   {
	PageFactory.initElements(driver, this);
}

 public void enterPinCode(String pincode )
{
	pincodeField.sendKeys(pincode);
	System.out.println("entering pincode....value is"+pincode);
}
 public void enterMobNum(String mobNumb)
 {
	mobNumField.sendKeys(mobNumb);
	System.out.println("entering mobnumer...is"+mobNumb);
 }
 public void clickonContinueButton() {
	continueButton.click();
	System.out.println("clicking on continue button");
 }
	
}
