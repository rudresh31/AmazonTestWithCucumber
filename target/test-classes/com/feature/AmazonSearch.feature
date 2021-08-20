Feature: Searching some products

Background: 
			Given User is on amazon main page "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"

@search		
Scenario Outline: Searching Mobile Phone
			When we enter ProductName "<ProductName>" in the search field
			And Select data "<SelectData>"
			And click on the Search button
			Then product Will appears
			
Examples: 
			|ProductName|SelectData|
			|Redmi Note 8|Redmi note 8 pro +|
			|hp laptops|hp laptops i3|
	