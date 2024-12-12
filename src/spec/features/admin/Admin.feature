@admin @smoketest
Feature: admin
  En tant que Admin je souhaite gérer les utilisateurs

  Background: 
    Given je me connecte sur l application orange
    When je saisis un username valide   "Admin"
    And je saisis un mot de pass valide   "admin123"
    And je clique sur le bouton Login

  @searchuser
  Scenario: je souhaite chercher utilisateur
    When je clique sur bouton Admin
    And je saisis dans champs username "Admin"
    And je clique sur bouton Search
    Then je verifie le tableau et "Admin" s affiche

  @adduser
  Scenario: je souhaite ajouter un utilisateur
    When je clique sur le bouton admin
    And je clique sur le bouton Add
    And je selectionne de la liste déroulante User Role
    And je selectionne le role Admin depuis le menu
    And je clique sur la liste déroulante status
    And je selectionne Enabled de la liste déroulante status
    And je saisis dans le champ Employee Name "Asanda Nombeko"
    And je saisis dans le champ Username "Scrum Master"
    And je saisis dans le champ Password "Scrum1"
    And je saisis dans le champ Confirm Password "Scrum1"
    And je clique sur le bouton Save
    Then je verifie dans le tableau affiché
    
    @addcancel
     Scenario: je souhaite annuler l jout d un utilisateur
     When je clique sur le bouton admin
     And clique sur le bouton Add
     And je clique sur bouton cancel
     Then je me redirige vers la page Admin et "AdminUser Management" s affiche
     
