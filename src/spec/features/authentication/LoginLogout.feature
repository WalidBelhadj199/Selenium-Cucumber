@login @smoketest
Feature: je souhaite tester la page de connexion
  En tant que utilisteur je souhaite tester la page de connexion

  Background: 
    Given je me connecte sur l application orange
    When je saisis un username valide   "Admin"
    And je saisis un mot de pass valide   "admin123"
    And je clique sur le bouton Login

  @login_valid_credential
  Scenario: je souhaite tester la page de connexion  avec des données valides
    Then je me redirge vers la page Home "Dashboard"

  @logout
  Scenario: je souhaite me déconnécté de lapplication
    When je clique sur la menu
    When je clique sur Logout
    Then je me derige vers la page d authentification et "Login" s affiche
