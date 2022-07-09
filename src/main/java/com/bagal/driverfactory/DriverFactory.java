package com.bagal.driverfactory;

import com.bagal.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public final class DriverFactory {
    private DriverFactory() {
    }

    public static WebDriver getDriver(BrowserType browserType) {
        WebDriver driver;

        switch (browserType) {
            case SAFARI:
                driver = new SafariBrowser().getDriver();
                break;
            case FIREFOX:
                driver = new FirefoxBrowser().getDriver();
                break;
            case CHROME:
                driver = new ChromeBrowser().getDriver();
                break;
            default:
                throw new IllegalArgumentException("Unsupported browser type: " + browserType);

        }

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

        return driver;
    }
}
