Feature: RegistrationFeature
  This feature deals with the login functionality of the application


  Scenario: Registration with valid email address
    Given I navigate to the home page
    And I enter following to create an account
      | emailaddress |
      | pankaj.sinha50@yahoo.in |
    And I click on createanaccount button
    And I enter the following
      |title | firstname | lastname | password | addrcompany | addraddress | addrcity | addrzipcode | addrmobile | addressalias |
      |Mr    | Pankaj    | Sinha | qwerty#123  | Wipro       | EC          | Bangalore| 90001       | 7829737373 | testAddress  |
    And I select date of birth
    |days | months| years|
    |12   | 4    | 2018 |
    And I select country and state
    |state | country|
    |Alaska| United States|
    And I click on register button
    Then I should see registration is successful

  Scenario: Registration with invalid email address
    Given I navigate to the home page
    And I enter following to create an account
      | emailaddress |
      | abc.gmail.com |
    And I click on createanaccount button
    Then I should see Invalid email address error message

