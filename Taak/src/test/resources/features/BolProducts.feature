Feature: Bol products
  In order to shop online
  As a user
  I want to see available products

  @localtest

  Scenario: Find Switch games from Nintendo
    Given I am on the new Nintendo Switch games page
    And The following games are available
      | Pokemon Legends: Arceus - Switch | Nintendo |
      | GTA Trilogy - Nintendo Switch | Rockstar |
      | Triangle Strategy - Nintendo Switch | Nintendo |
      | Assassin's Creed the Ezio Collection Nintendo Switch | Ubisoft |
      | Life is Strange: True Colors - Nintendo Switch | Square Enix |
      | WRC 10 - Nintendo Switch | Nacon |
      | GTA Trilogy - Nintendo Switch (Frans) | Rockstar |
      | Atelier Sophie 2: The Alchemist of the Mysterious Dream - Nintendo Switch - Nintendo Switch Lite - Nintendo Switch OLED - Nintendo Switch card | Koei |
      | YouTubers Life 2 - Switch | Maximum Games |
      | Dynasty Warriors 9 EMPIRES - Nintendo Switch | Koei Tecmo |
    When I filter for games by Nintendo
    Then I find 2 games
    And I find the game Triangle Strategy - Nintendo Switch by Nintendo


