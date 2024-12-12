@buzz @smoketest
Feature: buzz
  En tant que utilisteur je souhaite tester la creation d un buzz

  Background: 
    Given je me connecte sur l application orange
    When je saisis un username valide   "Admin"
    And je saisis un mot de pass valide   "admin123"
    And je clique sur le bouton Login

  @tag
  Scenario: je souhaite créer  un buzz
    When je clique sur bouton buzz
    And je saisis un nouveau buzz "Test automation"
    And je clique sur le bouton Post
    Then je verifie le buzz crée et "Test automation" s affiche
    When je clique sur la menu
    When je clique sur Logout
    Then je me derige vers la page d authentification et "Login" s affiche
