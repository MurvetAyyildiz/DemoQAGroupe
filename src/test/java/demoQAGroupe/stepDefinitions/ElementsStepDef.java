package demoQAGroupe.stepDefinitions;

import demoQAGroupe.pages.ElementPage;
import demoQAGroupe.utilities.ConfigReader;
import demoQAGroupe.utilities.Driver;
import demoQAGroupe.utilities.JSUtils;
import io.cucumber.java.en.Given;

public class ElementsStepDef {
    ElementPage elementPage=new ElementPage();
    @Given("L'utilisateur va à la page de l'elements")
    public void l_utilisateur_va_à_la_page_de_l_elements() {
        Driver.getDriver().get(ConfigReader.getProperty("demoqaUrl"));
        JSUtils.JSscrollIntoView(elementPage.element);
        elementPage.element.click();
    }

    @Given("Il clique sur {string} du menu des éléments")
    public void il_clique_sur_du_menu_des_éléments(String bouton) {
        switch (bouton){
            case "Buttons":
                elementPage.buttonsBoxButton.click();
                break;

        }


    }

}
