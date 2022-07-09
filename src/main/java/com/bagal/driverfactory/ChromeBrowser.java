package com.bagal.driverfactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class ChromeBrowser implements IDriver{
    @Override
    public WebDriver getDriver() {
       return WebDriverManager.chromedriver().create();
    }
}
