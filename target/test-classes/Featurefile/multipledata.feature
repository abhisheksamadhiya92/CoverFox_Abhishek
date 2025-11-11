Feature: multiple data test for coverFox Healthinsurance
Scenario Outline: TC01 validate coverFox health insurance plan for single person with multiple test
Given I am a home page
When I click on get started button 
And  I click on next button
And I provide age as "<age>" and click on next button
And I provide pincode "<pincode>" and "<mobNum>" and click on continue button
Then matching health insurance plas should be displayed as "<results>"
Examples:
|age|pincode|mobNum|results|
|20|474002|7867548347|48|
|23|432001|8765734569|57|
|32|453001|8976898898|60|