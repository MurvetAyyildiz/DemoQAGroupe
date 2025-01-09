@checkBox
  Feature: Vérification de l'arborescence des dossiers et fichiers
  En tant qu'utilisateur
  Je veux voir l'arborescence complète s'afficher
  Afin de vérifier que tous les dossiers et fichiers sont présents


  Scenario: Affichage de l'arborescence complète
    Given L utilisateur ouvre l application et va à la page de checkbox
    And  When L'utilisateur clique sur le bouton + à côté du dossier Documents
    Then Verifier les dossiers Home, Desktop, Documents et Downloads sont visibles
    And Verifier les sous-dossiers et fichiers sont visibles sous chaque dossier
    And Verifier les caises cochés après l'home clické
    And Fermer l application
