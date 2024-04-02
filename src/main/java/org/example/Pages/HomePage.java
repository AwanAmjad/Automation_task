package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFYC () {
        WebElement clickFindYourCity = driver.findElement(By.xpath("//span[text()='Find your city']"));
        clickFindYourCity.click();
    }

    public void homePageMethod () {

        clickFYC();

    }

}
