package com.liammoy.sdetproject.test;

// Import Java things

import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

// Import Selenium things

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTestSuite {
    protected WebDriver driver;

    @BeforeEach
    public void setupTest() {
//      ChromeOptions options = new ChromeOptions();        // disable GPU hardware acceleration in ChromeDriver
//      options.addArguments("--disable-gpu");              // disable GPU hardware acceleration in ChromeDriver            
//      driver = new ChromeDriver(options);                 // disable GPU hardware acceleration in ChromeDriver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.navigate().to("https://www.nab.com.au/");
    }

    @AfterEach
    public void teardownTest() {
        driver.close();
    }
}