package com.coverfox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CoverFoxResultsPage {

	@FindBy(xpath = "//div[contains(text(),'Insurance Plans')]") private WebElement matchingResults;
	
	public CoverFoxResultsPage(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);
	}
		
	public String getMatchingResultNumber() 
	{
	String result = matchingResults.getText();	
	System.out.println("fetching matching result");
	 String[] temp = result.split(" ");
	 String finalResult= temp[0];
	 String ActualResult= finalResult;
	 String expectedResult= ActualResult;
	return finalResult;
	}

	
}
