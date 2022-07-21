package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TutarialsNinja {

    public TutarialsNinja() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[text()='Phones & PDAs']")
    public WebElement phonesAndPDAs;

    @FindBy(tagName = "h4")
    public List<WebElement> phoneName;

    @FindBy(xpath = "//*[text()='Add to Cart']")
    public List<WebElement> addToCard;

    @FindBy(xpath= "(//button[@type='button'])[5]")
    public WebElement sepet;

    @FindBy(xpath = "//td[@class='text-left']")
    public List<WebElement> sepettekiUrunListesi;
}
