@Employee
Feature: Gestion des employés dans OrangeHRM

  
    Background: 
    Given je me connecte sur l application orange
    When je saisis un username valide   "Admin"
    And je saisis un mot de pass valide   "admin123"
    And je clique sur le bouton Login
    And Je navigue vers le module PIM

 @add_Employee
  Scenario: Ajouter un nouvel employe
    When Je clique sur le bouton Add Employee
    And Je remplis "Ali" dans le champ firstname
    And Je remplis "Salmi" dans le champ Lastname 
    And Je clique sur le bouton Save
    Then je me regirige vers la page "Personal Details"

@updateEmployee
  Scenario: Modifier les informations d'un employé
    When je recherche "Ali Salmi" dans la liste des employés
    And je clique Search
    And je sélectionne Ali Salmi dans le résultat de recherche
    And je clique sur le bouton Modifier
    And je modifie le champ Lastname par "Salem"
    And je clique suer bouton Save
    Then je devrais voir un message de succès
    And "Ali Salem" devrait être listé dans la page "Informations personnelles de l'employé"


 @deleteEmployee
  Scenario: Supprimer un employé existant
    When je saisis "Ali" dans le champ Employee Name
    And je clique sur le bouton search
    And je selectionne "Ali Salem" dans les résultats de recherche
    And je clique sur l bouton "Supprimer"
    And je confirme la suppression dans la boite de dialogue
    Then je devrais voir  message de succès
    And "Ali" ne devrait plus être listé dans la page "Liste des employés"