package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PopUp {

    public PopUp() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "button1")
    public WebElement button1;

    @FindBy(id = "button4")
    public WebElement button4;

    @FindBy(xpath = "//p[@id='confirm-alert-text']")
    public WebElement cancelYazisi;





}
