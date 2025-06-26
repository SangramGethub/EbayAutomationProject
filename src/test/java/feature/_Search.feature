Feature: This file contains Tescases for Ebay Site.


Scenario: Verify the SearchBar
    Given user is on HomePage
    And Search box is visible
    Then click on SearchBar
    And Enter "Watches" Keyword
    Then Verify the suggestions are related to "Watches"
    And Click on SearchButton
    And Take a screenshot
    

Scenario: Verify All categories List
      Given user is on HomePage
      When Click on allcategories Dropdown
      Then Verify the list
    
    