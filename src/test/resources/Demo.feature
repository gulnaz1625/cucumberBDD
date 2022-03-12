Feature: Payment Gateway functional test


  Scenario: Verify that the user can order a product
    Given The user wants to see payment gateway website
    When The user wants to buy elephant toy
    Then The user wants to enter payment information as
    |CNumber |4444444455558888|
    |EMount  |12              |
    |EYear   |2026            |
    |CVV     |777             |
    Then The user wants to pay now
    And The user wants to verify message as "Payment succesfull!"
