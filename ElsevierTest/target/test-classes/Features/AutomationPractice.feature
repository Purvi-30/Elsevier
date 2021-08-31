#Author: purvikala3003@gmail.com
#Summary - Automation Practice Test Task Solution

Feature: Summer dresses can be added to the cart and then user is able to Sign in to automation practice site

  Scenario: Verify that summer dresses can be added to the cart and it’s possible to proceed to the Sign in section.
    Given User is on Automation Practice website
    When User has added one summer dress to a cart
    And User has proceeded to checkout
    Then User is able to Sign in at the time of checkout