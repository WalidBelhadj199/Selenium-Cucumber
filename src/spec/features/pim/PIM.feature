@pim @smoketest
Feature: buzz
  En tant que utilisteur je souhaite tester PIM

  Background: 
    Given je me connecte sur l application orange
    When je saisis un username valide   "Admin"
    And je saisis un mot de pass valide   "admin123"
    And je clique sur le bouton Login
    When je clique sur bouton PIM

  @tagsearch
  Scenario: je souhaite chercher PIM
    When je saisis dans le champs Employee Name "0375"
    And je clique sur le bouton Search
    Then je verifie dans le tableau "0123" s affiche
    When je clique sur la menu
    When je clique sur Logout
    Then je me derige vers la page d authentification et "Login" s affiche

  @tagadd
  Scenario: je souhaite créer PIM
    When je clique sur bouton Add
    And je saisie dans le champs First Name "100"
    And je saisie dans le champs Middle Name "zak"
    And je saisie dans le champs Last Name "cyr"
    And je saisie dans le champs Employee Id "0100"
    And je clique sur le bouton save
    Then je me derige vers la page profil et "Personal Details" s affiche

  @tagcancel
  Scenario: je souhaite annuler PIM
    When je clique sur bouton Add
    And je clique sur le bouton cancel
    Then je me derige vers la page PIM et "PIM" s affiche
