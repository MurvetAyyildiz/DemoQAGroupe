package demoQAGroupe.pages;

import demoQAGroupe.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PracticePage {
    public PracticePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//table[1]")
    public WebElement premierTable;

    @FindBy(xpath = "//table[1]/thead")
    public WebElement tetesdePremierTable;


    @FindBy(xpath = "//table[1]/tbody/tr[3]/td[2]")
    public WebElement triosiemeRowJohn ;


    @FindBy(xpath = "//table[1]/tbody/tr[last()]")
    public WebElement dernierRow ;
    @FindBy(xpath = "//table[1]/tbody/tr/td[5]")
    public List<WebElement> columnesCinqieme ;

}
