Feature: Search Add and Remove Product
  @tugas
  Scenario: Search for product and add them to the cart then remove one of them
    Given User login with valid username "standard_user" and password "secret_sauce"
    And Veify that product Red Tsirt and Onsie are displayed
    And User navigate to filter button and short from Z to A
    And Click add to chart product onsie
    And Click add to chart product red tsirt
    And User open cart menu
    And Remove the red tsirt
    Then Click continue shopping

