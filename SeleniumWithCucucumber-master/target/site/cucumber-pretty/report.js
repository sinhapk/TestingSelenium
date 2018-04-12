$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "This feature deals with the login functionality of the application",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5134401952,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login with correct username and password",
  "description": "",
  "id": "loginfeature;login-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the following for Login",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "nshm9111339@gmail.com",
        "qwerty@123"
      ],
      "line": 8
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should see the userform page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.iNavigateToTheLoginPage()"
});
formatter.result({
  "duration": 8017133800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iEnterTheFollowingForLogin(DataTable)"
});
formatter.result({
  "duration": 452697310,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iClickLoginButton()"
});
formatter.result({
  "duration": 1313716472,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iShouldSeeTheUserformPage()"
});
formatter.result({
  "duration": 80118037,
  "status": "passed"
});
formatter.after({
  "duration": 186459713,
  "status": "passed"
});
formatter.before({
  "duration": 4062636752,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login with correct username and password to fail",
  "description": "",
  "id": "loginfeature;login-with-correct-username-and-password-to-fail",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I enter the following for Login",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 15
    },
    {
      "cells": [
        "admin",
        "adminpassword"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should see the userform page wrongly",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.iNavigateToTheLoginPage()"
});
formatter.result({
  "duration": 6460022843,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iEnterTheFollowingForLogin(DataTable)"
});
formatter.result({
  "duration": 305611419,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iClickLoginButton()"
});
formatter.result({
  "duration": 2116595662,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iShouldSeeTheUserformPageWrongly()"
});
formatter.result({
  "duration": 61647080,
  "status": "passed"
});
formatter.after({
  "duration": 198926168,
  "status": "passed"
});
formatter.uri("Registration.feature");
formatter.feature({
  "line": 1,
  "name": "RegistrationFeature",
  "description": "This feature deals with the login functionality of the application",
  "id": "registrationfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3902895758,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Registration with valid email address",
  "description": "",
  "id": "registrationfeature;registration-with-valid-email-address",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I navigate to the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter following to create an account",
  "rows": [
    {
      "cells": [
        "emailaddress"
      ],
      "line": 8
    },
    {
      "cells": [
        "pankaj.sinha50@yahoo.in"
      ],
      "line": 9
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on createanaccount button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter the following",
  "rows": [
    {
      "cells": [
        "title",
        "firstname",
        "lastname",
        "password",
        "addrcompany",
        "addraddress",
        "addrcity",
        "addrzipcode",
        "addrmobile",
        "addressalias"
      ],
      "line": 12
    },
    {
      "cells": [
        "Mr",
        "Pankaj",
        "Sinha",
        "qwerty#123",
        "Wipro",
        "EC",
        "Bangalore",
        "90001",
        "7829737373",
        "testAddress"
      ],
      "line": 13
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select date of birth",
  "rows": [
    {
      "cells": [
        "days",
        "months",
        "years"
      ],
      "line": 15
    },
    {
      "cells": [
        "12",
        "4",
        "2018"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select country and state",
  "rows": [
    {
      "cells": [
        "state",
        "country"
      ],
      "line": 18
    },
    {
      "cells": [
        "Alaska",
        "United States"
      ],
      "line": 19
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on register button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I should see registration is successful",
  "keyword": "Then "
});
formatter.match({
  "location": "Registration.iNavigateToTheHomePage()"
});
formatter.result({
  "duration": 8303330041,
  "status": "passed"
});
formatter.match({
  "location": "Registration.iEnterFollowingToCreateAnAccount(DataTable)"
});
formatter.result({
  "duration": 269571205,
  "status": "passed"
});
formatter.match({
  "location": "Registration.iClickOnCreateanaccountButton()"
});
formatter.result({
  "duration": 178804290,
  "status": "passed"
});
formatter.match({
  "location": "Registration.iEnterTheFollowing(DataTable)"
});
formatter.result({
  "duration": 6826218360,
  "status": "passed"
});
formatter.match({
  "location": "Registration.iSelectDateOfBirth(DataTable)"
});
formatter.result({
  "duration": 677865688,
  "status": "passed"
});
formatter.match({
  "location": "Registration.iSelectCountryAndState(DataTable)"
});
formatter.result({
  "duration": 356354505,
  "status": "passed"
});
formatter.match({
  "location": "Registration.iClickOnRegisterButton()"
});
formatter.result({
  "duration": 931955970,
  "status": "passed"
});
formatter.match({
  "location": "Registration.iShouldSeeRegistrationIsSuccessful()"
});
formatter.result({
  "duration": 72388816,
  "status": "passed"
});
formatter.after({
  "duration": 317449372,
  "status": "passed"
});
formatter.before({
  "duration": 3337579070,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Registration with invalid email address",
  "description": "",
  "id": "registrationfeature;registration-with-invalid-email-address",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "I navigate to the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I enter following to create an account",
  "rows": [
    {
      "cells": [
        "emailaddress"
      ],
      "line": 26
    },
    {
      "cells": [
        "abc.gmail.com"
      ],
      "line": 27
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I click on createanaccount button",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I should see Invalid email address error message",
  "keyword": "Then "
});
formatter.match({
  "location": "Registration.iNavigateToTheHomePage()"
});
formatter.result({
  "duration": 12304942352,
  "status": "passed"
});
formatter.match({
  "location": "Registration.iEnterFollowingToCreateAnAccount(DataTable)"
});
formatter.result({
  "duration": 190159379,
  "status": "passed"
});
formatter.match({
  "location": "Registration.iClickOnCreateanaccountButton()"
});
formatter.result({
  "duration": 165743542,
  "status": "passed"
});
formatter.match({
  "location": "Registration.iShouldSeeInvalidEmailAddressErrorMessage()"
});
formatter.result({
  "duration": 66210815,
  "status": "passed"
});
formatter.after({
  "duration": 195984031,
  "status": "passed"
});
});