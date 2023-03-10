package com.cydeo.tests.Omer.Day02_Locators_FindElement_GetText_GetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D02_HWP3_Navigation {
    public static void main(String[] args) {

        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");
        WebElement cookies = driver.findElement(By.id("W0wltc"));
        cookies.click();

        //3- Click to Gmail from top right.
        WebElement gmail = driver.findElement(By.linkText("Gmail"));
        gmail.click();

        //4- Verify title contains:
        //Expected: Gmail
        if (driver.getTitle().equals("Gmail"))
            System.out.println("Title verification PASSED.");
        else System.out.println("Title verification FAILED.");

        //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //Expected: Google
        if (driver.getTitle().equals("Google"))
            System.out.println("Title verification PASSED.");
        else System.out.println("Title verification FAILED.");
        driver.quit();
    }
}
