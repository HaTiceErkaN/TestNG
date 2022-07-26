package tests.practise3;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PopUp;
import utilities.Driver;
import utilities.TestBase;

public class Q4 extends TestBase {

    // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
    // 2. CLICK ME of JavaScript Alert e tıklayın
    // 3. pop up text i alın
    // 4. Mesajın "I am an alert box!"  olduğunu doğrulayın.
    // 5. pop up i kabul edin

    // Yine ayni class da baska test methodu olusturun
    // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
    // 2.  CLICK ME of JavaScript Confirm Box i  TIKLAYIN
    // 3.  pop up text i alın
    // 4. Mesajın "Press a button!" olduğunu doğrulayın
    // 5. Açılır pencereyi kapat
    // 6. pop up i iptal edin,
    // 7. "You pressed Cancel!" yazisinin goruntulendigini dogrulayin
    // 8. alert1'e göre dependsOnMethods kullanın
    PopUp popUp= new PopUp();
@Test
    public void alert01(){
    Driver.getDriver().get("http://webdriveruniversity.com/Popup-Alerts/index.html");

    popUp.button1.click();
    String actualAllertMessage=Driver.getDriver().switchTo().alert().getText();
    String expectedAllertMessage="I am an alert box!";
    Assert.assertEquals(actualAllertMessage,expectedAllertMessage);
    Driver.getDriver().switchTo().alert().accept();

}

@Test(dependsOnMethods ="alert01")
    public void alert02(){

    Driver.getDriver().get("http://webdriveruniversity.com/Popup-Alerts/index.html");
    popUp.button4.click();
    String actualMesage= Driver.getDriver().switchTo().alert().getText();
    String expectedMessage="Press a button!";
    Assert.assertEquals(actualMesage,expectedMessage);
    Driver.getDriver().switchTo().alert().dismiss();
    popUp.cancelYazisi.isDisplayed();


}
}
