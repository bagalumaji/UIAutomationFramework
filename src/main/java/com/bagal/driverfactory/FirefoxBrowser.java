package com.bagal.driverfactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class FirefoxBrowser implements IDriver{
    @Override
    public WebDriver getDriver() {
        return WebDriverManager.firefoxdriver().create();
    }
}
