package org.example.Tests;

import io.cucumber.java.bs.A;
import org.example.Pages.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {

    WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tripshepherd.com/");
    }

    @Test
    public void NavigateToHomePage() {
        HomePage homePage = new HomePage(driver);
        FindYourCity findCity = new FindYourCity(driver);
        ToursInAustin tourInAustin = new ToursInAustin(driver);
        PTAustinDetails PTofAustin = new PTAustinDetails(driver);
        Checkout checkout = new Checkout(driver);

        //---------------/--------------------------------------------/------------------------------------

        homePage.homePageMethod();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

        //---------------/--------------------------------------------/------------------------------------

        findCity.FindYourCityMethod();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }


        //---------------/--------------------------------------------/------------------------------------


        tourInAustin.privateTourOfAustinMethod();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        PTofAustin.PTAustinDetailsMethod();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        checkout.checkoutMethod();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    //---------------/--------------------------------------------/------------------------------------

    @After
        public void close () {
            driver.quit();
        }
    }

