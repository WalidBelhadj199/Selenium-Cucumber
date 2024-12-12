@recruitment @smoketest
Feature: recruitment
  En tant que Admin je souhaite gérer les utilisateurs

  Background: 
    Given je me connecte sur l application orange
    When je saisis un username valide   "Admin"
    And je saisis un mot de pass valide   "admin123"
    And je clique sur le bouton Login
    And je clique sur le bouton Recruitment

  @recruitmentSearch
  Scenario: je souhaite chercher utilisateur
    When je clique sur la liste déroulante Vacancy
    And je selectionne la valeur Senior QA Lead
    And je Tape sur bouton Search
    Then je verifie tableau et "Senior QA Lead" s affiche
   