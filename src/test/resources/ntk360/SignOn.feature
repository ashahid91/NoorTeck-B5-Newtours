Feature: Sign-On

  Scenario: Verify user able to login
    Given User is on the home page
    When User click on sign-on button
    And User enter username "joh.cena"
    And User enter password "johncena123"
    And User click submit button
    Then Verify Log-In Successfully message is displayed
    
