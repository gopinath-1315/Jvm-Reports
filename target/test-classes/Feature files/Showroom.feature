Feature: To validate home page

  Background: 
    Given user has to in home page

  @smoke
  Scenario Outline: to verify search text box
    When user has to enter product names "<products>"
    Then user has to click enter button

    Examples: 
      | products |
      | cap      |
      | watch    |

  @sanity
  Scenario: to verify login functionality
    When user has to enter "saravanan00@gmail.com" and "7402516716"
    Then user has to click login button
