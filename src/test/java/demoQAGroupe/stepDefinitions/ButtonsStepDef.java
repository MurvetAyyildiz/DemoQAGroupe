package demoQAGroupe.stepDefinitions;

import demoQAGroupe.pages.ButtonsPage;
import demoQAGroupe.pages.ElementPage;
import demoQAGroupe.pages.TextBoxMurvetPage;
import demoQAGroupe.utilities.*;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class ButtonsStepDef {

    ElementPage elementPage = new ElementPage();
    ButtonsPage buttonsPage = new ButtonsPage();


    @And("Il fait {string} sur le bouton appelé {string}")
    public void ilFaitSurLeBoutonAppelé(String clique, String bouton) {
        switch (bouton) {
            case "Double Click Me":
               ReusableMethods.scroll(buttonsPage.doubleClickBtn);
                ActionsUtils.doubleClick(buttonsPage.doubleClickBtn);
                break;
            case "Right Click Me":
                ReusableMethods.scroll(buttonsPage.rightClickBtn);
                ActionsUtils.rightClick(buttonsPage.rightClickBtn);
                break;
            case "Click Me":
                ReusableMethods.click(buttonsPage.clickBtn);
                break;
            default:
                throw new IllegalArgumentException(String.format("Unexpected field as %s", bouton));
        }
    }

    @Then("Il vérifie que le bouton {string} fonctionne comme prévu.")
    public void il_vérifie_que_le_bouton_fonctionne_comme_prévu(String bouton) {
        switch (bouton) {
            case "Double Click Me":
                Assert.assertEquals("You have done a double click", buttonsPage.messageDoubleClickBtn.getText());
                break;
            case "Right Click Me":
                Assert.assertEquals("You have done a right click", buttonsPage.messageRightClickBtn.getText());
                break;
            case "Click Me":
                Assert.assertEquals("You have done a dynamic click", buttonsPage.messageClickBtn.getText());
                break;
            default:
                throw new IllegalArgumentException(String.format("Unexpected field as %s", bouton));


        }

    }


}
