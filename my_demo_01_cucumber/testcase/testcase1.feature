Feature: To login and shop in demowebshop

Background: Launch and login to the website
Given Launch using chrome browser 
Then Enter the required valid credentials and Click on login

Scenario: Selection of some product and adding it to the cart
Given Select any product 
Then Add the selected product to the cart
And Goto to cart and see for the selected products and add or remove the products and update the cart

Scenario: Logout from the website
Given Logout from the website by clicking on logout