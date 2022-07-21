package tests.automationExercise;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseCross;

public class TC4 extends TestBaseCross{
    AutomationExercisePage auto= new AutomationExercisePage();

    @Test
    public void test0() throws InterruptedException {

       // 2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));

       // 3. Verify that home page is visible successfully
        Assert.assertTrue(auto.homePage.isDisplayed());

       // 4. Click on 'Signup / Login' button
        auto.login.click();

       // 5. Verify 'Login to your account' is visible
        Assert.assertTrue(auto.verifyLogin.isDisplayed());

       // 6. Enter correct email address and password
        auto.email.sendKeys(ConfigReader.getProperty("trueEmail"));
        auto.password.sendKeys(ConfigReader.getProperty("truePassword"));

       // 7. Click 'login' button
        auto.submit.click();

       // 8. Verify that 'Logged in as username' is visible
        Assert.assertTrue(auto.girisYapildi.isDisplayed());

       // 9. Click 'Logout' button
        auto.logout.click();

       // 10. Verify that user is navigated to login page
        Assert.assertTrue(auto.logoutYazisi.isDisplayed());

        Driver.closeDriver();
    }
}
