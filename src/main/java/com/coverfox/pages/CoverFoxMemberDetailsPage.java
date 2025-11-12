package com.coverfox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.coverfox.Util.Utility;

public class CoverFoxMemberDetailsPage {
	
	@FindBy(id ="Age-You") private WebElement ageDropDown;
	@FindBy(className = "next-btn") private WebElement nextButton;
	public CoverFoxMemberDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void handleageDropDown(String age)
	{
		Utility.handleDropDOwnUsingVisibleText(ageDropDown,age+" years ");
		//Utility.handleDropDown(ageDropDown,age+" years ");
	}
    
	public void clickOnNextButton()
	{
		nextButton.click();
		System.out.println("clicking on next button");
	}
}
