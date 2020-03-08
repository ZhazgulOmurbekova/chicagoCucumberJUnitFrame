Feature: Etsy search functionality
  CBT-25 Agile Story : can be placed here


  Background: user on etsy home page
    Given User is on Etsy home page

  @etsy
  Scenario: Etsy search title verification
    When User searches for wooden spoon
    Then User should see wooden spoon in the Etsy title

  Scenario: Etsy search title verification
    When User searches for "wooden spoon"
    Then User should see "Wooden spoon" in the Etsy title

    Scenario: Etsy search title verification
      When User searches for "custom wooden spoon"
      Then User should see "Custom wooden spoon" in the Etsy title

