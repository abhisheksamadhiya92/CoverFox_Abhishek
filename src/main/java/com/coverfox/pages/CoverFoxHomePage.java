package com.coverfox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHomePage {

	//variables
	@FindBy(xpath = "//button[text()='Get Started']") private WebElement GetstartedButton;
	
	
	
	
	//constructor
	
	public CoverFoxHomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	
	//method
	
	public void clickOnGetstartedButton()
	{
		GetstartedButton.click();
		System.out.println("clicking on GetstartedButton ");
	}
	
}
