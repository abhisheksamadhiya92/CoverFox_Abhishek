Feature: CoverFox health insurance test
Scenario: TC01 validate CoverFox Insurance plan for single person
Given I am on home page
When I click on Get started button
And I click on next button 
And I provide age as "34" and click on next button
And i provide pincode as "452001", mobNumber as "8888888888" and click on continue button
Then maching HealthInsurance plans should be displayed as "48"

Scenario: TC02  validate coverfox car insurance
Given I am on home page
When I click on car Insurance
And I provide valid RTO number and click on view quotes button
And I provide valid details and click on view quotes button
Then Ishould get plan details

Scenario: TC03 validate coverfox bike insurance
Given I am on home page
When I click on bike insurance
And  I provide valid RTO number and click on view quotes button
And I provide valid details and click on view quotes button
Then Ishould get plan details
