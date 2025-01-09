package demoQAGroupe.stepDefinitions;

import demoQAGroupe.pages.ElementPage;
import demoQAGroupe.pages.WebElementsPage;
import demoQAGroupe.utilities.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class WebTableStepDef {

    ElementPage elementPage=new ElementPage();
    WebElementsPage webElementsPage=new WebElementsPage();

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
        public void fnaviguerVersLaPageWebTable() {
            Driver.getDriver().get(ConfigReader.getProperty("demoqaUrl"));
            JSUtils.JSscrollIntoView(elementPage.element);
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
    List<Map<String, String>> users;
    @When("I add the following users:")
    public void addUsers(DataTable dataTable) {
        users = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> user : users) {
            // Click Add Button
            ReusableMethods.click(webElementsPage.addButton);
            //form opened
            // Fill the form fields
            webElementsPage.fillForm(
                    user.get("FirstName"),
                    user.get("LastName"),
                    user.get("Email"),
                    user.get("Age"),
                    user.get("Salary"),
                    user.get("Department")
            );

            // Click Submit
            webElementsPage.submitButton.click();

        }
    }



    @Then("Validate the users added to the webtable")
    public void validateTheUsersAddedToTheWebtable() {
       Assert.assertTrue(webElementsPage.filledRowList.size()== users.size()+3);
    }

    @Then("Validate the user is placed in the last row")
    public void validateTheUserIsPlacedInTheLastRow() {
        WaitUtils.waitFor(2);
        Assert.assertEquals("ali@mail.com",webElementsPage.controlEmail.getText());

    }

    @Then("validate users can be deleted")
    public void validateUsersCanBeDeleted() {

        for (int i = users.size()+2; i >= 0; i--) {
            ReusableMethods.click(webElementsPage.deleteIcon);
        }
        Assert.assertTrue(webElementsPage.filledRowList.size()==0);

    }


}

