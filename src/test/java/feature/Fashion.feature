Feature: This file contains testcases for Fashion Page


Scenario: Search for appropriate sneakers in fashion category

     Given user is on HomePage
     When mouse hover on Fashion category Dropdown
     Then Select "sneakers" value in dropdown list
     And Scroll upto Shop By US Man Size 
     And select size "7.5"
     And select brand "Nike"
     And Verify the applied Filters


Scenario:  Verify the view 
      When user clicks on view dropdown
      
      Then Take screenshot to verify is it showing gallery view
      And when user selects List view
      Then Take screenshot to verify is it showing List view
     
     
     