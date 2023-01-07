Feature: Validate a hotel booking functionality in Adactin hotelApplication
@Ad1
Scenario: Login Page 
   Given user Launch The Adactin Url
   When user enter Username In Username Field
   And user enter Password In password Field
   Then user Click The Login Button And IT Navigate To Search Hotel Page
@Ad2   
Scenario: Search Hotel
   When user Select The Location In Location Field
   And user Select The Hotel In Hotels Field
   And user Select The Room type In Room TYpe Field    
   And user Select The No Of Rooms In No Of Rooms Field
   And user Enter The Check In Date In Check In Date Field
   And user Enter The Check Out Date In Check Out Date Field 
   And user Select The Adults Per Room In Aduts Per Room Field
   And user Select The Children Per Room In Children Per Room Field 
   Then user Click The Search Button And It Navigate To Select Hotel Page
@Ad3   
Scenario: Select Hotel

   When user Click The RadioButton In The Select RadioButton Field
   Then user Click The Continue Button And It Navigate To Bokk A Hotel Page
@Ad4   
Scenario: Book A Hotel 

   When user Enter The First Name In The First Name Field
   And user Enter The Last Name In The Last Name Field 
   And user Enter The Billing Address In The Billing Address Field    
   And user Enter The Credt Card Number In The Credit Card Number Field 
   And user Select The Credit Card Type In The Credit Card Type Field
   And user Select The Month In The Month Field
   And user Select The Year In The Year Field
   And user Enter The Cvv In The Cvv Field
   Then user Click The Book Now Button 
   
     


