Feature: check when a shipments is a dangerous type and assign instantly red channel 

Scenario: The shipment is incorrectly assign to other channel 

Given Go to the shipment layout and enter in a new register
When  Someone enter all the information of a shipment including their type
And Send the information to verify if it can be created
Then The shipments is created
And The system send an error 
Then The user can checked and reentry the shipment 
