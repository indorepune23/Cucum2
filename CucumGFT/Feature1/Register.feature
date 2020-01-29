Feature: Register 

Scenario: Register on TestMeApp 
	Given user open TestMeApp 
	When user click SignUp 
	And user name as "Gaurav345" 
	And enter first name as "Gauravgau" 
	And enter last name as "Tanejaja" 
	And enter password as "Gau123987" 
	And enter confirm password as "Gau123987" 
	And select gender as "male" 
	And enter email as "gaur123@gmail.com" 
	And enter mobile number as "8358939387" 
	And enter DOB as "10/3/1991" 
	And enter Address as "indorepunemaharashtra" 
	And enter security question as "What is your Nick Name" 
	And enter answer as "gaur" 
	Then user click on Register 
	
@Login
	Scenario: Login on TestMeApp
	Given users open homepage
	When user click on SignIn
	   |lalitha|Password123|
	 
	   
@Search
Scenario: Search product
	   Given users open homepage1
	When user click on SignIn1
	 |lalitha|Password123|
	And user search for a product
	|head|
	Then user add to cart
	