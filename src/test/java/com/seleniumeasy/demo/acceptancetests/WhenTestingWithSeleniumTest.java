package com.seleniumeasy.demo.acceptancetests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhenTestingWithSeleniumTest {
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
    public void openBrowserTest(){
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }


    @Test
    @Tag("uiTest")
    public void justCheckingIfTagsCanFilterTests(){
        System.out.println("This is a tagged test");
    }
}
