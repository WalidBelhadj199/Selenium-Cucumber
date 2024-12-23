@pim2 @smoketest
Feature: PIM2
  En tant que utilisteur je souhaite tester PIM
  
  Background: 
    Given je me connecte sur l application orange
    When je saisis un username valide   "Admin"
    And je saisis un mot de pass valide   "admin123"
    And je clique sur le bouton Login
    When je clique sur bouton PIM 

    @tagsearch2
  Scenario: je souhaite chercher un PIM
    When je saisis dans champs Employee Name "0375"
    And je Clique sur un bouton Search
    Then je verifie dans tableau "0375" s affiche
    When je clique sur la menu
    When je clique sur Logout
    Then je me derige vers la page d authentification et "Login" s affiche
    
    @tagadd2
  Scenario: je souhaite créer PIM
    When je clique bouton Add
    And je saisie dans  champs First Name "100"
    And je saisie dans  champs Middle Name "zak"
    And je saisie dans  champs Last Name "cyr"
    And je saisie dans  champs Employee Id "0100"
    And je clique sur bouton save
    Then je me derige vers la page profil et "Personal Details" s affiche
    
    
    
    
    