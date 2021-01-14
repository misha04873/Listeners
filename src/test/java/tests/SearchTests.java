package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.GoogleSearch;

public class SearchTests {

    private static WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }




    @Test
    public void firstTest(){
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.setText("Dota 2");
        googleSearch.clickButton();
        googleSearch.printTitle();
    }
}
