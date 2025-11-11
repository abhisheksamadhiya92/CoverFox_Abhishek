package com.coverfox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlans {
	
	
	
	@FindBy(className="next-btn") private WebElement nextButton;
	
	public CoverFoxHealthPlans(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnNextButton() 
	{
		nextButton.click();
		System.out.println("clicking on next button");
	}

}
