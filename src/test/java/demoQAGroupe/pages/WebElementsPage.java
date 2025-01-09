package demoQAGroupe.pages;

import demoQAGroupe.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebElementsPage {

    public WebElementsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "addNewRecordButton")
    public WebElement addButton;
    @FindBy(id = "firstName")
    public WebElement firstNameButton;
    @FindBy(id = "lastName")
    public WebElement lastNameButton;
    @FindBy(id = "userEmail")
    public WebElement emailButton;
    @FindBy(id = "age")
    public WebElement ageButton;
    @FindBy(id = "salary")
    public WebElement salaryButton;
    @FindBy(id = "department")
    public WebElement departmentButton;
    @FindBy(id = "submit")
    public WebElement submitButton;
    @FindBy(xpath = "//div[@class='rt-tr -odd' or @class='rt-tr -even']")
    public List<WebElement> filledRowList;
    @FindBy(xpath = "((//div[@class='rt-tr -even' and @role='row'])[1]//div)[4]")
    public WebElement lastRowControl;
@FindBy(xpath = "//div[text()='ali@mail.com']")
    public WebElement controlEmail;

@FindBy(xpath = "(//span[@title='Delete'])[1]")
    public WebElement deleteIcon;



    public void fillForm(String firstName, String lastName, String email, String age, String salary, String department) {
        firstNameButton.sendKeys(firstName);
        lastNameButton.sendKeys(lastName);
        emailButton.sendKeys(email);
        ageButton.sendKeys(age);
        salaryButton.sendKeys(salary);
        departmentButton.sendKeys(department);
    }

}
