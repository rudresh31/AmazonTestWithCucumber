Feature: Amazon Login validation 

Background:
 		Given User is on amazon main page
 		When we click on sign button
 		Then login page is appears
 		
Scenario: login using Incorrect Email
		When we enter Wrong email
		|rrrrrrrrruuuuuuu@gmail.com|
		And click on continue button
		Then Error message is appears
		
Scenario: login with Correct Email and Incorrect password
		When we enter Corect email
		|rudrapandey170@gmail.com|
		And click on continue button
		And Enter Incorrect password
		|123456789|
		And click on sign button
		Then Error message is appears
		
Scenario: login with Correct email and Correct password
		When we enter Corect email
		|rudrapandey170@gmail.com|
		And click on continue button
		And Enter Correct password
		|#Pandey31|
		And click on sign button
		Then main page is apperas