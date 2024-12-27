package demoQAGroupe.stepDefinitions;

import demoQAGroupe.pages.PracticePage;
import demoQAGroupe.utilities.ConfigReader;
import demoQAGroupe.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

import static demoQAGroupe.utilities.ReusableMethods.printData;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PracticeStepdefs {
    PracticePage practicePage=new PracticePage();

    @Given("Ouvrir la page de herokuapp")
    public void ouvrirLaPageDeHerokuapp() {
        Driver.getDriver().get(ConfigReader.getProperty("herukoUrl"));
    }

    @Then("Verifier les informations visibles")
    public void verifierLesInformationsVisibles() {
        System.out.println(practicePage.premierTable.getText());
    }

    @And("Fermer le site web herukoap")
    public void fermerLeSiteWebHerukoap() {
        Driver.closeDriver();
    }

    @And("Verfier les tetes qui sont Last Name,First Name,Due,Web Site,Action")
    public void verfierLesTetesQuiSontLastNameFirstNameDueWebSiteAction() {
       String tetesdePremierTableText = practicePage.tetesdePremierTable.getText();
       assertTrue(tetesdePremierTableText.contains("Last Name"));
        System.out.println(tetesdePremierTableText);
    }


    @And("Verifier que deuxieme colone inclu John comme prenom")
    public void verifierQueDeuxiemeColoneIncluJohnCommePrenom() {
      WebElement resultReel= practicePage.triosiemeRowJohn;
        System.out.println(resultReel.getText());
       String resultAttendu="John";
        System.out.println(resultAttendu);
       assertEquals(resultAttendu,resultReel.getText());

    }

    @And("Verifier le dernier row qui est Tim comme prenom")
    public void verifierLeDernierRowQuiEstTimCommePrenom() {
    WebElement dernierRow=practicePage.dernierRow;
       assertTrue(dernierRow.getText().contains("Tim"));

    }

    @And("Besinci column sutun datalarini print edin")
    public void besinciColumnSutunDatalariniPrintEdin() {
        List<WebElement> columnesCinqieme = practicePage.columnesCinqieme;

        for (WebElement w:columnesCinqieme){
            System.out.println(w.getText());
        }
       columnesCinqieme.forEach(t-> System.out.println(t.getText()));
      printDatalar(2,3);

    }

    private void printDatalar(int satir, int sutun) {

    }


}
