
Feature:Fonctionnalité des boutons
  Background:
    Given L'utilisateur va à la page de l'elements

  Scenario: S'assurer que tous les boutons exécutent correctement leurs actions prévue
     When Il clique sur "Buttons" du menu des éléments
    And Il fait "double-clique" sur le bouton appelé "Double Click Me"
    Then Il vérifie que le bouton "Double Click Me" fonctionne comme prévu.
    And Il fait "clique-droit" sur le bouton appelé "Right Click Me"
    Then Il vérifie que le bouton "Right Click Me" fonctionne comme prévu.
     And Il fait "un clique" sur le bouton appelé "Click Me"
    Then Il vérifie que le bouton "Click Me" fonctionne comme prévu.
