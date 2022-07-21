package tests.day22_crossBrowser;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProvider {



    @Test
    public void test01(){
        AmazonPage amazonPage= new AmazonPage();
        //amazon anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //nutella icin arama yapalim
        amazonPage.aramaKutusu.sendKeys("nutella"+ Keys.ENTER);

        //sonuclarin nutella aradigini test edelim
        Assert.assertTrue(amazonPage.aramaSonucElementi.getText().contains("nutella"));

        Driver.closeDriver();

    }


    @DataProvider
    public static Object[][] AranacakKelimeler() {
    Object[][] arananKelimeAArrayi={{"Nutella"}, {"Java"}, {"cigdem"},{"netherlads"}};
        return arananKelimeAArrayi;
    }

    @Test(dataProvider = "AranacakKelimeler")

    //arayacagimiz kelimeleri bir liste gibi tutup bana yollayacak bir veri saglayicisi olusturcaz.
    public void dataProviderTesti(String arananKelime) {
        AmazonPage amazonPage= new AmazonPage();
        //amazon anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //nutella,Java,cigdem ve Netherlads icin arama yapalim
        amazonPage.aramaKutusu.sendKeys(arananKelime+ Keys.ENTER);

        //sonularin aradigimiz kelime icerdigini test edelim ve sayfayi kapatalim

        Assert.assertTrue(amazonPage.aramaSonucElementi.getText().contains(arananKelime));
        Driver.closeDriver();
    }
}
