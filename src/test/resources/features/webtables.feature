@webTable
 Feature: Vérification de l’affichage initial de web Tables

   Scenario: TC01 Vérifier que la table s’affiche correctement avec les titres

     Given  Naviguer vers la page Web Table
     And Liste attendue des en-têtes de colonnes
     |First Name|
     |Last Name |
     |Age       |
     |Email     |
     |Salary    |
     |Department|
     |Action    |
     And Liste réelle récupérée depuis la table
     Then Vérifier si les en-têtes correspondent
     And Fermer l application


   Scenario: TC02 Ajouter un enregistrement
   Given donné que je suis sur la page Web Tables
   When je clique sur le bouton Add, je remplis Prénom avec Caty, Nom de famille avec Doek,Âge avec 35, Email avec catydoek@example.com, Salaire avec 38000,Département avec IT et je clique sur Submit
   Then je devrais voir John Doe dans la table
     #And  Verifier les colonnes



