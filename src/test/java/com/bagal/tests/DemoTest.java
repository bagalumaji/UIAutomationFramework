package com.bagal.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoTest {
    @Test
    public void demoTest(){
        WebDriverManager.chromedriver().create();
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        driver.quit();

    }
}
