package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ToursInAustin {

    WebDriver driver;

    public ToursInAustin(WebDriver driver) {
        this.driver = driver;
    }

    public void clickPrivateTourOfAustin () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement clickPTAustin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href, '/tours/private-tour-of-austin')]")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickPTAustin);

        clickPTAustin.click();
    }


    public void privateTourOfAustinMethod () {

        clickPrivateTourOfAustin();

    }
}
