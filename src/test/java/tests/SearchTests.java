package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.GoogleSearch;

@Listeners({listeners.TestNGListeners.class})
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


    @Test
    public void secondTest1(){
        System.out.println("Second test");
    }

    @Test(enabled = false)
    public void secondTest2(){
        System.out.println("Second test");
    }


    @Test
    public void secondTest3(){
        System.out.println("Second test");
    }

    @Test
    public void secondTest(){
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.setText("League of legends");
        googleSearch.clickButton();
        googleSearch.printTitle();
    }
}
