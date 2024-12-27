package demoQAGroupe.stepDefinitions;

import demoQAGroupe.pages.ElementPage;
import demoQAGroupe.utilities.ConfigReader;
import demoQAGroupe.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class WebTableStepDef {

    ElementPage elementPage=new ElementPage();
    List<WebElement> titreDeTetesReel;
    List<String> titreDeTetesAttendue;


    @When("je clique sur le bouton Add, je remplis Prénom avec Caty, Nom de famille avec Doek,Âge avec {int}, Email avec catydoek@example.com, Salaire avec {int},Département avec IT et je clique sur Submit")
    public void jeCliqueSurLeBoutonAddJeRemplisPrénomAvecCatyNomDeFamilleAvecDoekÂgeAvecEmailAvecCatydoekExampleComSalaireAvecDépartementAvecITEtJeCliqueSurSubmit(int age, int salaire) {
    }

    @Then("je devrais voir John Doe dans la table")
    public void jeDevraisVoirJohnDoeDansLaTable() {
    }

    @Given("donné que je suis sur la page Web Tables")
    public void donnéQueJeSuisSurLaPageWebTables() {
    }



        @Given("Naviguer vers la page Web Table")
        public void naviguerVersLaPageWebTable() {
            Driver.getDriver().get(ConfigReader.getProperty("demoqaUrl"));
            elementPage.element.click();
            elementPage.webTableButton.click();

        }



        @And("Liste réelle récupérée depuis la table")
        public void listeRéelleRécupéréeDepuisLaTable() {
             titreDeTetesReel= elementPage.titreDeTetes;
            titreDeTetesReel.forEach(t-> System.out.println(t.getText()));

        }


    @And("Liste attendue des en-têtes de colonnes")
    public void listeAttendueDesEnTêtesDeColonnes(DataTable dataTable) {

     titreDeTetesAttendue = dataTable.asList();

    }

    @Then("Vérifier si les en-têtes correspondent")
    public void vérifierSiLesEnTêtesCorrespondent() {

        for (int i = 0; i < titreDeTetesAttendue.size(); i++) {
            assertEquals(titreDeTetesAttendue.get(i),titreDeTetesReel.get(i).getText());

        }
    }
}

