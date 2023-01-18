Feature: Promotions

Scenario: Add new discount
		Given User Launch Chrome browser
		When User opens URL "http://admin-demo.nopcommerce.com/login"
		And User enters Email as "admin@yourstore.com" and Password as "admin"
		And Click on Login
		Then User can view Dashboad
		When User clicks on promotions menu
		And clicks on discounts
		And click on Add new button
		Then User can view add new discount page
		When User enters discount info
		And click on Save button
		Then User can view confirmation message "The new discount has been added successfully"
		And close browser 
