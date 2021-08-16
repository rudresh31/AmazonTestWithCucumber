Feature: Amazon Login validation 

Background:
 		Given User is on amazon main page "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
 		When we click on sign button
 		Then login page is appears "Amazon Sign In"
 		
 		
Scenario: login using Incorrect Email
		When we enter Wrong email
		|WrongEmail|
		|Enter Correct Incorrect here|
		And click on continue button
		Then Error message is appears
		
Scenario: login with Correct Email and Incorrect password
		When we enter Corect email
		|RightEmail|
		|Enter Correct Email here|
		And click on continue button
		And Enter Incorrect password
		|WrongPassword|
		|123456789|
		And click on sign button
		Then Error message is appears
		
Scenario: login with Correct email and Correct password
		When we enter Corect email
		|RightEmail|
		|Enter Correct Email here|
		And click on continue button
		And Enter Correct password
		|RightPassword|
		|Enter Correct password here|
		And click on sign button
		Then main page is apperas "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"