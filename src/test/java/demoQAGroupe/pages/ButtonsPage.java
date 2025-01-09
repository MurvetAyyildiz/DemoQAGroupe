package demoQAGroupe.pages;

import demoQAGroupe.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage {
    public ButtonsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="doubleClickBtn")
    public WebElement doubleClickBtn;
    @FindBy(id="rightClickBtn")
    public WebElement rightClickBtn;
    @FindBy(xpath="//button[text()='Click Me']")
    public WebElement clickBtn;
    @FindBy(id="doubleClickMessage")
    public WebElement messageDoubleClickBtn;
    @FindBy(id="rightClickMessage")
    public WebElement messageRightClickBtn;
    @FindBy(id="dynamicClickMessage")
    public WebElement messageClickBtn;




}
