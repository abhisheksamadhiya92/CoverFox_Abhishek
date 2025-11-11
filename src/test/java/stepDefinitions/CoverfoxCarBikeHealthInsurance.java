package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CoverfoxCarBikeHealthInsurance
{


@When("I click on car Insurance")
public void i_click_on_car_insurance() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("I click on car Insurance");
}

@When("I provide valid RTO number and click on view quotes button")
public void i_provide_valid_rto_number_and_click_on_view_quotes_button() {
   System.out.println("I provide valid RTO number and click on view quotes button");
}

@When("I provide valid details and click on view quotes button")
public void i_provide_valid_details_and_click_on_view_quotes_button() {
    System.out.println("I provide valid details and click on view quotes button");
}

@Then("Ishould get plan details")
public void ishould_get_plan_details()
{
    System.out.println("Ishould get plan details");
}
@When("I click on bike insurance")
public void i_click_on_bike_insurance() {
  System.out.println("I click on bike insurance");
}
	
}
