@webTable
Feature: Vérification de l’affichage initial de web Tables

  Background:
    Given Naviguer vers la page Web Table

  Scenario: TC01 Vérifier que la table s’affiche correctement avec les titres

    And Liste attendue des en-têtes de colonnes
      | First Name |
      | Last Name  |
      | Age        |
      | Email      |
      | Salary     |
      | Department |
      | Action     |
    And Liste réelle récupérée depuis la table
    Then Vérifier si les en-têtes correspondent
     #And Fermer l application



  Scenario: Add multiple users to the web table

    When I add the following users:
      | FirstName | LastName | Email           | Age | Salary | Department |
      | Ali       | Yılmaz   | ali@mail.com    | 25  | 5000   | IT         |
      | Ayşe      | Demir    | ayse@mail.com   | 30  | 6000   | HR         |
      | Mehmet    | Kaya     | mehmet@mail.com | 28  | 4500   | Sales      |
      | Elif      | Çelik    | elif@mail.com   | 35  | 7000   | Marketing  |
      | Hasan     | Taş      | hasan@mail.com  | 40  | 8000   | Finance    |
    Then Validate the users added to the webtable

  Scenario: the added user is placed in the last row

    When I add the following users:
      | FirstName | LastName | Email        | Age | Salary | Department |
      | Ali       | Yılmaz   | ali@mail.com | 25  | 5000   | IT         |

    Then Validate the user is placed in the last row
   #tablonun icindeki hic bir datayi yazdiramadim. getText falan olmadi

  Scenario: users can be deleted from the table
    When I add the following users:
      | FirstName | LastName | Email           | Age | Salary | Department |
      | Michelle  | Yılmaz   | yilmaz@mail.com | 25  | 5000   | IT         |
      | Mehmet    | Kaya     | mehmet@mail.com | 28  | 4500   | Sales      |
      | Elif      | Çelik    | elif@mail.com   | 35  | 7000   | Marketing  |
      | Hasan     | Taş      | hasan@mail.com  | 40  | 8000   | Finance    |
    Then validate users can be deleted





