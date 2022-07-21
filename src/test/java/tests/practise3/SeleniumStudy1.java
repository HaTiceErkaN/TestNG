package tests.practise3;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TutarialsNinja;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseCross;

import java.util.ArrayList;
import java.util.List;

public class SeleniumStudy1 extends TestBaseCross {

    @Test
    public void test01() throws InterruptedException {
        TutarialsNinja ttn = new TutarialsNinja();
        // ~ Navigate to http://tutorialsninja.com/demo/index.php?route=common/home
        Driver.getDriver().get(ConfigReader.getProperty("ttnUrl"));
        // ~ click on Phones & PDAs
        ttn.phonesAndPDAs.click();

        // ~ get the brandName of phones
        List<String > phoneNameString = new ArrayList<>();
        ttn.phoneName.stream().forEach(t-> phoneNameString.add(t.getText()));
        System.out.println(phoneNameString);

        // ~ click on add to button for all elements
        ttn.addToCard.stream().forEach(t-> t.click());
        System.out.println("  ******  ");
        Thread.sleep(3000);

        // ~ click on black total added cart button
        ttn.sepet.click();


        // ~ get the names of list from the cart
        List<String > sepettekiUrunString = new ArrayList<>();
        ttn.sepettekiUrunListesi.stream().forEach(t-> sepettekiUrunString.add(t.getText()));
        System.out.println(sepettekiUrunString);


        // ~ compare the names from displaying list and cart list
        Assert.assertTrue(sepettekiUrunString.containsAll(phoneNameString));
        Driver.closeDriver();


    }

}
