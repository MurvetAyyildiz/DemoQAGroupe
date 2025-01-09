package demoQAGroupe.pages;

import demoQAGroupe.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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




    @FindBy(xpath = "(//*[@id='item-2'])[1]" )
    public WebElement   radioBox;

    @FindBy(xpath = "//label[@for='yesRadio']" )
    public WebElement checkYes;

    @FindBy(xpath = "//span[@class='text-success']")
    public WebElement textSuccess;

    @FindBy(xpath = "//label[@for='impressiveRadio']" )
    public WebElement checkImpressive;






    @FindBy(xpath = "(//span[.='Home'])[2]")
    public WebElement homeText;

    @FindBy(xpath = "//*[.='Office']")
    public WebElement officeText;

    @FindBy(xpath = "//ol")
    public WebElement toutesLesDossier;
    @FindBy(xpath = "//*[@d=\"M19 3H5c-1.11 0-2 .9-2 2v14c0 1.1.89 2 2 2h14c1.11 0 2-.9 2-2V5c0-1.1-.89-2-2-2zm-9 14l-5-5 1.41-1.41L10 14.17l7.59-7.59L19 8l-9 9z\"]")
    public List<WebElement> checkboxes ;


    @FindBy(xpath = "//span[.='You have selected :']")
    public WebElement resultText;


    //Web Table

    @FindBy(xpath = "//h1[.='Web Tables']")
    public WebElement titreDeWebTable;


    @FindBy(xpath = "//*[.='Web Tables']")
    public WebElement webTableButton;

@FindBy(xpath = "(//*[.='First Name'])[2]")
public WebElement firstName;

    @FindBy(xpath = "(//*[.='Last Name'])[2]")
    public WebElement lastName;

    @FindBy(xpath = "//*[.='Age']")
    public WebElement age;
    @FindBy(xpath = "(//*[.='Email'])[2]")
    public WebElement email;

    @FindBy(xpath = "(//*[.='Salary'])[2]")
    public WebElement salary;

    @FindBy(xpath = "//div[@class='rt-resizable-header-content']")
    public List<WebElement> titreDeTetes;



    @FindBy(id = "addNewRecordButton")
    public WebElement addButtonWebTable;

    @FindBy(id = "searchBox")
    public WebElement searchBoxWebTable;


    @FindBy(xpath = "(//ol)[2]")
    public List<WebElement> checkboxMainElements;
    @FindBy (xpath = "//span[text()='Buttons']")
    public WebElement buttonsBoxButton;
    @FindBy (xpath = "//span[text()='Links']")
    public WebElement linksBoxButton;


}
