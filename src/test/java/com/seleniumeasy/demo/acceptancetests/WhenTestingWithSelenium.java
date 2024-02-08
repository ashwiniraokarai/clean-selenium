package com.seleniumeasy.demo.acceptancetests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhenTestingWithSelenium {
    WebDriver driver;

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void openBrowser(){
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }
}
