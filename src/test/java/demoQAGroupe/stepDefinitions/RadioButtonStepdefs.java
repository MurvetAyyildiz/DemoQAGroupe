package demoQAGroupe.stepDefinitions;

import demoQAGroupe.pages.ElementPage;
import demoQAGroupe.utilities.ConfigReader;
import demoQAGroupe.utilities.Driver;
import demoQAGroupe.utilities.WaitUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RadioButtonStepdefs {

    ElementPage elementsPage = new ElementPage();


    @Given("utilisateur va sur lapp.")
    public void utilisateurVaSurLapp() {
        Driver.getDriver().get(ConfigReader.getProperty("demoqaUrl"));
        elementsPage.element.click();
        WaitUtils.waitFor(3);
        elementsPage.radioBox.click();

    }


    @When("utilisateur accede à la page et clique sur le boutton yes")
    public void l_utilisateur_accede_à_la_page_et_clique_sur_le_boutton_yes() {
        WaitUtils.waitFor(3);
        elementsPage.checkYes.submit();
    }
    @When("test si le bouton yes fonctionne")
    public void test_si_le_bouton_yes_fonctionne() {
        String actResult = elementsPage.textSuccess.getText();
        Assert.assertTrue(actResult.contains("Yes"));
    }
    @When("utilisateur accede à la page et clique sur le boutton impressive")
    public void l_utilisateur_accede_a_la_page_et_clique_sur_le_boutton_impressive() {
        // Artık PendingException yok, gerçek aksiyonu yazdık:
        elementsPage.checkImpressive.click();
    }
    // Aynı şekilde test_si_le_bouton_impressive_fonctionne içinde de PendingException kaldırılmalı:
    @And("test si le bouton impressive fonctionne")
    public void test_si_le_bouton_impressive_fonctionne() {
        // Kod yazıldı, PendingException atılmıyor:
        String actResult = elementsPage.textSuccess.getText();
        Assert.assertTrue(actResult.contains("Impressive"));
    }


    @And("fermer la page")
    public void fermer_la_page() {
        Driver.closeDriver();
    }




}
