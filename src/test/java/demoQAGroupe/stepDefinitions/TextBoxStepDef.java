package demoQAGroupe.stepDefinitions;

import demoQAGroupe.pages.ElementPage;
import demoQAGroupe.pages.TextBoxPage;
import demoQAGroupe.utilities.ConfigReader;
import demoQAGroupe.utilities.Driver;
import demoQAGroupe.utilities.JSUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TextBoxStepDef {

      ElementPage elementPage =new ElementPage();
      TextBoxPage textBoxPage =new TextBoxPage();
    @Given("L utilisateur ouvre l application et va à la page de textBox")
    public void lUtilisateurOuvreLApplicationEtVaÀLaPageDeTextBox() {
        Driver.getDriver().get(ConfigReader.getProperty("demoqaUrl"));
       JSUtils.JSscrollIntoView(elementPage.element);
       elementPage.element.click();
        textBoxPage.textBoxButton.click();
    }


    @When("Il définit {string} à {string} sur la page TextBox.")
    public void ilDéfinitÀSurLaPageTextBox(String champs, String valeur) {

        switch (champs) {
            case "FullName":
                textBoxPage.fullNameBox.sendKeys(valeur);
                break;
            case "Email":
                textBoxPage.emailBox.sendKeys(valeur);
                break;
            case "CurrentAddress":
                textBoxPage.currentAddressBox.sendKeys(valeur);
                break;
            case "PermanentAddress":
                textBoxPage.permanentAddressBox.sendKeys(valeur);
                break;
            default:
                throw new IllegalArgumentException(String.format("Unexpected field as %s", champs));

        }
    }

    @And("Il clique sur le bouton Submit sur la page TextBox")
    public void ilCliqueSurLeBoutonSubmitSurLaPageTextBox() {
       textBoxPage.submitButton.click();
    }

    @Then("Il vérifie que le formulaire a été créé.")
    public void ilVérifieQueLeFormulaireAÉtéCréé() {
        Assert.assertFalse(textBoxPage.outputElement.getText().isEmpty());
    }
}
