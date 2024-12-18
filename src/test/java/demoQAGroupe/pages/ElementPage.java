package demoQAGroupe.pages;

import demoQAGroupe.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementPage {
    public ElementPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="(//h5)[1]")
    public WebElement element;

    @FindBy(css = "#item-1")
    public WebElement checkBox ;
    @FindBy(xpath= "//*[@class=\"rct-icon rct-icon-expand-all\"]")
    public WebElement plusIconeDeCheckBox ;
}
