package com.bagal.base;

import com.bagal.driver.Driver;
import com.bagal.enums.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        Driver.initDriver(BrowserType.CHROME);
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        Driver.quitDriver();
    }
}

