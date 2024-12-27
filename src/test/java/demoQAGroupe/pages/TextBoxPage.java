package demoQAGroupe.pages;

import demoQAGroupe.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {
    public TextBoxPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//span[text()='Text Box']")
    public WebElement textBoxButton;
    @FindBy(id="userName")
    public WebElement fullNameBox;

    @FindBy(id="userEmail")
    public WebElement emailBox;
    @FindBy(id="currentAddress")
    public WebElement currentAddressBox;
    @FindBy(id="permanentAddress")
    public WebElement permanentAddressBox;

    @FindBy(id="submit")
    public WebElement submitButton;
    @FindBy(id="output")
    public WebElement outputElement;
    @FindBy(xpath ="(//div[contains(@class,'top-card')]/div)[1]")
    public WebElement elementTitle;


}
