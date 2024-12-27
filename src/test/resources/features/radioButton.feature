
@RadioButton
Feature: US03 Radio Button Test

  Scenario: TC01 Tester le bouton yes
    Given utilisateur va sur lapp.
    When utilisateur accede à la page et clique sur le boutton yes
    And test si le bouton yes fonctionne
    And fermer la page

  Scenario: TC02 Tester le bouton impressive
    Given utilisateur va sur lapp.
    When utilisateur accede à la page et clique sur le boutton impressive
    And test si le bouton impressive fonctionne
    And fermer la page