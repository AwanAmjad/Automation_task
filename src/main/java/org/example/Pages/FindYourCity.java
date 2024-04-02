package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FindYourCity {
    WebDriver driver;

    public FindYourCity(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAustin () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement clickCityAustin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@alt, 'Austin')]")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickCityAustin);

        clickCityAustin.click();
    }

    public void FindYourCityMethod () {

        clickAustin();

    }
}
