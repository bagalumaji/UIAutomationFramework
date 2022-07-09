package com.bagal.driverfactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class SafariBrowser implements IDriver{
    @Override
    public WebDriver getDriver() {
        return WebDriverManager.safaridriver().create();
    }
}
