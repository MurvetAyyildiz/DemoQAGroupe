
@US02CheckBox
  Feature: Vérification de l'arborescence des dossiers et fichiers
  En tant qu'utilisateur
  Je veux voir l'arborescence complète s'afficher
  Afin de vérifier que tous les dossiers et fichiers sont présents

  Scenario: Affichage de l'arborescence complète
    Given L utilisateur ouvre l application et va à la page de checkbox
    And  When L'utilisateur clique sur le bouton + à côté du dossier Documents
    When L'arborescence des fichiers est affichée
    Then Verifier les dossiers Home, Desktop, Documents et Downloads sont visibles
    And Verifier les sous-dossiers et fichiers sont visibles sous chaque dossier
    And Fermer l application