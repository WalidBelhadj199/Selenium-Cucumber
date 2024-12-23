@buzz2 @smoketest
Feature: buzz
  En tant que utilisteur je souhaite tester la creation d un buzz
  
Background: 
    Given je me connecte sur l application orange
    When je saisis un username valide   "Admin"
    And je saisis un mot de pass valide   "admin123"
    And je clique sur le bouton Login
    
    @tag2
    Scenario: je souhaite créer  un buzz
    When je clique bouton buzz
    And je saisis nouveau buzz "Happy"
    And je clique bouton Post
    And je verifie  buzz crée et "Happy" s affiche
    And je clique sur menu trois pts
    And je clique sur modifier
    And je saisis "So happy"
    And je tape sur bouton Post
    And je verifie le buzz crée "HappySo happy"s affiche
    And je tape sur menu
    And je clique sur Delete
    And je tape sur bouton yes delete
    When je clique sur la menu
    When je clique sur Logout
    Then je me derige vers la page d authentification et "Login" s affiche