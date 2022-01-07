Feature: Registering new user

  Scenario: Registering new user with valid information
    Given User is on Register Page
    When User enter  first name "John"
    And User enter  last name	"Cena"	
    And User enter phone number "1234566666"
    And User enter email address "john.cena@gmail.com"
    And User enter city name	"Cenatown"
    And User enter state name "Virginia"
    And User choose country from drop down "value" "UNITED STATES"
    And User enter user name "john.cena"
    And User enter password  "johncena123"
    And User confirm password "johncena123"
    And User click submit button to register
    Then Verify Thank you for registering message
