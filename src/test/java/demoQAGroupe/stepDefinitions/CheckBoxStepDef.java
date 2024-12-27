package demoQAGroupe.stepDefinitions;

import demoQAGroupe.pages.ElementPage;
import demoQAGroupe.utilities.ConfigReader;
import demoQAGroupe.utilities.Driver;
import demoQAGroupe.utilities.JSUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckBoxStepDef {
    ElementPage elementPage=new ElementPage();


    @Given("L utilisateur ouvre l application et va à la page de checkbox")
    public void lUtilisateurOuvreLApplicationEtVaÀLaPageDeCheckbox() {
      Driver.getDriver().get(ConfigReader.getProperty("demoqaUrl"));
        JSUtils.JSscrollIntoView(elementPage.element);
        elementPage.element.click();
        elementPage.checkBox.click();


    }
    @And("When L'utilisateur clique sur le bouton + à côté du dossier Documents")
    public void whenLUtilisateurCliqueSurLeBoutonÀCôtéDuDossierDocuments() {
      elementPage.plusIconeDeCheckBox.click();

    }

    @When("L'arborescence des fichiers est affichée")
    public void lArborescenceDesFichiersEstAffichée() {

    }


    @And("Verifier les sous-dossiers et fichiers sont visibles sous chaque dossier")
    public void verifierLesSousDossiersEtFichiersSontVisiblesSousChaqueDossier() {
    }


    @Then("Verifier les dossiers Home, Desktop, Documents et Downloads sont visibles")
    public void verifierLesDossiersHomeDesktopDocumentsEtDownloadsSontVisibles() {
    }


    @And("Fermer l application")
    public void fermerLApplication() {
        Driver.closeDriver();
    }

}
