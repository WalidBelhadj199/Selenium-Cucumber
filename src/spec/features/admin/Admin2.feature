@admin2 @smoketest
Feature: admin2
  En tant que Admin je souhaite gérer les utilisateurs
  
  Background: 
    Given je me connecte sur l application orange
    When je saisis un username valide   "Admin"
    And je saisis un mot de pass valide   "admin123"
    And je clique sur le bouton Login

    
    @searchuser2
  Scenario: je souhaite chercher utilisateur
  
    When je clique sur l Admin
    And je saisis dans un champs username "Admin"
    And je clique sur un bouton Search
    Then je verifie un tableau et "Admin" s affiche
    
    @adduser2
  Scenario: je souhaite ajouter un utilisateur
    When je clique sur bouton admin
    And je clique sur  bouton Add
    And je selectionne  la liste déroulante User Role
    And je selectionne  role Admin depuis le menu
    And je clique sur  liste déroulante status
    And je selectionne Enabled de liste déroulante status
    And je saisis dans l champ Employee Name "Asanda Nombeko"
    And je saisis dans l champ Username "Scrum Master"
    And je saisis dans l champ Password "Scrum1"
    And je saisis dans l champ Confirm Password "Scrum1"
    And je clique sur bouton Save
    Then je verifie dans tableau affiché et "Asandra Nombeko" s affiche
    
    @addcancel2
     Scenario: je souhaite annuler l jout d un utilisateur
     When je clique bouton admin
     And clique sur l bouton Add
     And je clique bouton cancel
     Then je me redirige vers page Admin et "AdminUser Management" s affiche
    
    