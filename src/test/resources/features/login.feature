Feature: Login User

  Scenario: Login user, select product, comparison of the price and name of the product in the
  basket with the one selected from the catalog
    Then Click "Вход" button span
    And Input login
    And Input password
    And Click "Войти" button
    And Content with "Кабинет" visible
    And Click on "Ноутбуки" tab
    And Click "Купить" the selected product
    And Click  button window
    And Press Escape and Click "Оформить" button cart
    And Product in cart "Lenovo IdeaPad S145-15AST 81N300CFRE " visible

    And Input name required product
    And Input price required product
    And Check product name
    And Check product price
