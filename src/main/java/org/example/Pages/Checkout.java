package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Checkout {

    WebDriver driver;

    public Checkout(WebDriver driver) {
        this.driver = driver;
    }

    public void checkoutName () {
//        WebElement ContactName = driver.findElement(By.xpath("//input[@placeholder='Name']"));
//        ContactName.sendKeys("Task");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement ContactName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Name']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ContactName);
        ContactName.sendKeys("Task");
    }



    public void checkoutEmail () {
        WebElement ContactEmail = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        ContactEmail.sendKeys("Task@gmail.com");
    }

    public void checkoutNumber () {
        WebElement ContactNumber = driver.findElement(By.className("PhoneInputInput"));
        ContactNumber.sendKeys("4584131188");
    }

    public void checkoutCardNumber () {
//        WebElement CardNumber = driver.findElement(By.xpath("//input[@placeholder='1234 1234 1234 1234']"));
//        CardNumber.sendKeys("4242424242424242");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement CardNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Field-numberInput")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CardNumber);
        CardNumber.sendKeys("4242424242424242");
    }

    public void checkoutExpiry () {
        WebElement CardNumber = driver.findElement(By.xpath("//input[@placeholder='MM / YY']"));
        String date = "12 / 24";
        CardNumber.sendKeys(date);
    }

    public void checkoutCVC () {
        WebElement CVC = driver.findElement(By.xpath("//input[@placeholder='CVC']"));
        CVC.sendKeys("456");
    }


    public void clickPay () {
        WebElement PayBtn = driver.findElement(By.xpath("//button[text()='Pay']"));
        PayBtn.click();
    }

    public void checkoutMethod () {

        checkoutName();
        checkoutEmail();
        checkoutNumber();
      //  checkoutCardNumber();
        checkoutExpiry();
        checkoutCVC();
        clickPay();

    }
}
