package tests.automationExercise;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseCross;

public class TC5 extends TestBaseCross {
    AutomationExercisePage auto= new AutomationExercisePage();

    @Test
    public void test01() throws InterruptedException {


       // 2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));

       // 3. Verify that home page is visible successfully
        Assert.assertTrue(auto.homePage.isDisplayed());

       // 4. Click on 'Signup / Login' button
        auto.login.click();

       // 5. Verify 'New User Signup!' is visible
        Assert.assertTrue(auto.newUserSignUp.isDisplayed());

       // 6. Enter name and already registered email address
        auto.newName.sendKeys("Hatice Erkan");
        auto.newEmail.sendKeys(ConfigReader.getProperty("trueEmail"));
        Thread.sleep(3000);

       // 7. Click 'Signup' button
        auto.newSignUpButton.click();

       // 8. Verify error 'Email Address already exist!' is visible
        Assert.assertTrue(auto.alreadyExist.isDisplayed());
    }
}
