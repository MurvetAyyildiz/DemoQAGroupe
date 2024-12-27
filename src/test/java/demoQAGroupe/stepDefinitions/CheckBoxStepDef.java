package demoQAGroupe.stepDefinitions;

import demoQAGroupe.pages.ElementPage;
import demoQAGroupe.utilities.ConfigReader;
import demoQAGroupe.utilities.Driver;
import demoQAGroupe.utilities.WaitUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CheckBoxStepDef {
    ElementPage elementPage=new ElementPage();


    @Given("L utilisateur ouvre l application et va à la page de checkbox")
    public void lUtilisateurOuvreLApplicationEtVaÀLaPageDeCheckbox() {
        Driver.getDriver().get(ConfigReader.getProperty("demoqaUrl"));
        elementPage.element.click();
        elementPage.checkBox.click();


    }
    @And("When L'utilisateur clique sur le bouton + à côté du dossier Documents")
    public void whenLUtilisateurCliqueSurLeBoutonÀCôtéDuDossierDocuments() {
      elementPage.plusIconeDeCheckBox.click();

    }


    @And("Verifier les sous-dossiers et fichiers sont visibles sous chaque dossier")
    public void verifierLesSousDossiersEtFichiersSontVisiblesSousChaqueDossier() {
        assertTrue(elementPage.homeText.isDisplayed());
        assertTrue(elementPage.officeText.isDisplayed());

    }


    @Then("Verifier les dossiers Home, Desktop, Documents et Downloads sont visibles")
    public void verifierLesDossiersHomeDesktopDocumentsEtDownloadsSontVisibles() {
        //assertTrue(elementPage.toutesLesDossier.isEnabled());
        List<WebElement> checkboxMainElements=elementPage.checkboxMainElements;
        for (WebElement w:checkboxMainElements){
            assertTrue(w.isDisplayed());
            System.out.println(w.getText());

        }

    }


    @And("Fermer l application")
    public void fermerLApplication() {
        Driver.closeDriver();
    }

    @And("Verifier les caises cochés après l'home clické")
    public void verifierLesCaisesCochésAprèsLHomeClické() {

        WaitUtils.waitFor(3);

        elementPage.homeText.click();

        WaitUtils.waitFor(3);
        //assertTrue(elementPage.checkboxHome.isSelected());

      //  List <WebElement> checkboxes=elementPage.checkboxes;

        assertTrue(elementPage.resultText.isDisplayed());



   /* for (WebElement w :checkboxes){
        System.out.println(w);
        assertTrue(w.isSelected());
    }*/


    }



}
