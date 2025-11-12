package stepDefinitions;

import org.testng.Assert;

import com.coverfox.DriverConfig.DriverFactory;
import com.coverfox.pages.CoverFoxAddressDetailsPage;
import com.coverfox.pages.CoverFoxHealthPlans;
import com.coverfox.pages.CoverFoxHomePage;
import com.coverfox.pages.CoverFoxMemberDetailsPage;
import com.coverfox.pages.CoverFoxResultsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HealthInsurance
{
	CoverFoxAddressDetailsPage coverFoxAddressDetailsPage= new CoverFoxAddressDetailsPage(DriverFactory.getDriver());
	CoverFoxHealthPlans coverFoxHealthPlans =new CoverFoxHealthPlans(DriverFactory.getDriver());
	CoverFoxHomePage coverFoxHomePage =new CoverFoxHomePage(DriverFactory.getDriver());
	CoverFoxMemberDetailsPage coverFoxMemberDetailsPage= new CoverFoxMemberDetailsPage(DriverFactory.getDriver());
	CoverFoxResultsPage coverFoxResultsPage = new CoverFoxResultsPage(DriverFactory.getDriver());
	
	@Given("I am on home page")
	public void i_am_on_home_page() throws InterruptedException {
	   System.out.println("I am on home page");
	   Thread.sleep(2000);
	}

	@When("I click on Get started button")
	public void i_click_on_get_started_button() throws InterruptedException {
	   coverFoxHomePage.clickOnGetstartedButton();
	  System.out.println("I click on Get started button");
	  Thread.sleep(2000);
	}
   
	@When("I click on next button")
	public void i_click_on_next_button() throws InterruptedException {
		coverFoxMemberDetailsPage.clickOnNextButton();
	   System.out.println("I click on next button");
	   Thread.sleep(2000);
	}

	@When("I provide age as {string} and click on next button")
	public void i_provide_age_as_and_click_on_next_button(String age) throws InterruptedException {
		coverFoxMemberDetailsPage.handleageDropDown(age);
		coverFoxMemberDetailsPage.clickOnNextButton();
	   System.out.println("I provide age as" +age+ " and click on next button");
	   Thread.sleep(2000);
	}

	@When("i provide pincode as {string}, mobNumber as {string} and click on continue button")
	public void i_provide_pincode_as_mob_number_as_and_click_on_continue_button(String pincode, String mobNumber) throws InterruptedException {
	 coverFoxAddressDetailsPage.enterPinCode(pincode);
	 coverFoxAddressDetailsPage.enterMobNum(mobNumber);
	 coverFoxAddressDetailsPage.clickonContinueButton();
	 
	    System.out.println("i provide pincode as "+452001+", mobNumber as "+mobNumber+" and click on continue button");
	    Thread.sleep(3000);
	}


@Then("maching HealthInsurance plans should be displayed as {string}")
public void maching_health_insurance_plans_should_be_displayed_as(String results) throws InterruptedException {
   coverFoxResultsPage.getMatchingResultNumber();
   System.out.println("maching HealthInsurance plans should be displayed as"+results);
   Thread.sleep(3000);
   String expectedResult= "48";
   String actualResult=results;
   Assert.assertEquals(actualResult, expectedResult);



}
}
