@Murvet
Feature: Demoqa Textbox test
  Scenario: Cas de test valide pour la page Textbox
    Given L utilisateur ouvre l application et va à la page de textBox
    When Il définit "FullName" à "Murvet" sur la page TextBox.
    And Il définit "Email" à "abc@gmail.com" sur la page TextBox.
    And Il définit "CurrentAddress" à "6 rue de la petite croze" sur la page TextBox.
    And Il définit "PermanentAddress" à "6 rue de la petite croze" sur la page TextBox.
    And Il clique sur le bouton Submit sur la page TextBox
    Then Il vérifie que le formulaire a été créé.