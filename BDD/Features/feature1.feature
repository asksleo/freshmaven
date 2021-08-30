Feature: to test the hcl application
@ValidCredentials
  Scenario: login page with valid user
    Given Open chrome browser and url of the application 
    When Enter Username and Enter Password and click on login button
    Then Login success
    
    @InvaliadCredentials
  Scenario: login page with valid user
    Given Open chrome browser and url of the application 
    When enter invalid username and password
    Then Login failed