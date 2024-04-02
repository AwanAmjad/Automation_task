package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PTAustinDetails {

    WebDriver driver;

    public PTAustinDetails(WebDriver driver) {
        this.driver = driver;
    }

    public void selectDate () {
        WebElement calendarIcon = driver.findElement(By.xpath("//*[contains(@class, 'border') and contains(@class, 'rounded') and contains(@class, 'border-gray-300') and contains(@class, 'w-full') and contains(@class, 'px-4') and contains(@class, 'py-2') and contains(@class, 'gap-2') and contains(@class, 'flex') and contains(@class, 'relative') and contains(@class, 'items-center') and contains(@class, 'hover:cursor-pointer')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", calendarIcon);
        //calendarIcon.click();
        calendarIcon.click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'border') and contains(@class, 'rounded') and contains(@class, 'border-gray-300') and contains(@class, 'w-full') and contains(@class, 'px-4') and contains(@class, 'py-2') and contains(@class, 'gap-2') and contains(@class, 'flex') and contains(@class, 'relative') and contains(@class, 'items-center') and contains(@class, 'hover:cursor-pointer')]")));


        String desiredDate = "2024-04-19";
        WebElement dateElement = driver.findElement(By.xpath("//span[contains(text(), '" + desiredDate + "')]"));
        dateElement.click();

//        WebElement calendarElement = driver.findElement(By.xpath("//*[contains(@class, 'border') and contains(@class, 'rounded') and contains(@class, 'border-gray-300') and contains(@class, 'w-full') and contains(@class, 'px-4') and contains(@class, 'py-2') and contains(@class, 'gap-2') and contains(@class, 'flex') and contains(@class, 'relative') and contains(@class, 'items-center') and contains(@class, 'hover:cursor-pointer')]"));
//        calendarElement.click();
//
//        WebElement dateElement = driver.findElement(By.xpath("//abbr[@aria-label='19 April 2024']"));
//        dateElement.click();
    }

    public void selectChangeTime () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement selectTime = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,\"DateAndPax\")]/..//span[text()='  12:30 pm']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectTime);
        selectTime.click();
    }

    public void selectNoOfPassengers(){
        WebElement dropdown = driver.findElement(By.xpath("//*[contains(@class, 'flex') and contains(@class, 'justify-between') and contains(@class, 'cursor-pointer') and contains(@class, 'bg-white') and contains(@class, 'pb-2') and contains(@class, 'border') and contains(@class, 'border-gray-300') and contains(@class, 'rounded-md') and contains(@class, 'py-2') and contains(@class, 'pl-2') and contains(@class, 'items-center') and contains(@class, 'align-middle') and contains(@class, 'text-black')]"));
        dropdown.click();

        WebElement fifthOption = driver.findElement(By.xpath("//div[contains(@class, 'relative')]//p[5]"));

        fifthOption.click();
    }


    public void clickBookNow () {
        WebElement clickBNBtn = driver.findElement(By.xpath("//*[contains(concat(' ', normalize-space(@class), ' '), ' bg-[#FD5D5A] ') and contains(concat(' ', normalize-space(@class), ' '), ' rounded-md ') and contains(concat(' ', normalize-space(@class), ' '), ' py-3 ') and contains(concat(' ', normalize-space(@class), ' '), ' text-white ')]"));
        clickBNBtn.click();
    }

    public void PTAustinDetailsMethod () {


        selectChangeTime();
        //selectDate();
        selectNoOfPassengers();
        clickBookNow();

    }
}
