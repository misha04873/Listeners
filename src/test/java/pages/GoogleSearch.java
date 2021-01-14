package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearch {

    WebDriver driver;

    By textfield = By.name("q");
    By button = By.name("btnK");

    public GoogleSearch(WebDriver driver){
        this.driver = driver;
    }

    public void setText(String text) {
    driver.findElement(textfield).sendKeys(text);
    driver.findElement(button).isDisplayed();
    driver.findElement(button).isEnabled();
    }

    public void clickButton() {
    driver.findElement(button).isDisplayed();
    driver.findElement(button).isEnabled();
    System.out.println("Button is enabled");
    driver.findElement(button).click();
    }

    public void printTitle() {
      String title = driver.getTitle();
      System.out.println(title);
    }



}
