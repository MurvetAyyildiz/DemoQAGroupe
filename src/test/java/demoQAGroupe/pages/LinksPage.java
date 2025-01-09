package demoQAGroupe.pages;

import demoQAGroupe.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinksPage {
    public LinksPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "simpleLink")
    public WebElement linkHome;
    @FindBy(id = "dynamicLink")
    public WebElement linkHomeTmAKD;
    @FindBy(id = "created")
    public WebElement linkCreated;
    @FindBy(id = "no-content")
    public WebElement linkNoContent;
    @FindBy(id = "moved")
    public WebElement linkMoved;
    @FindBy(id = "bad-request")
    public WebElement linkBadRequest;
    @FindBy(id = "unauthorized")
    public WebElement linkUnauthorized;
    @FindBy(id = "forbidden")
    public WebElement linkForbidden;
    @FindBy(id = "invalid-url")
    public WebElement linkNotFound;
    @FindBy(id = "linkResponse")
    public WebElement linkResponse;


}
