package com.bagal.driver;

import com.bagal.driverfactory.DriverFactory;
import com.bagal.enums.BrowserType;

import java.util.Objects;

public final class Driver {
    private Driver(){}

    public static void initDriver(BrowserType browserType){
        if(Objects.isNull(DriverManager.getDriver())){
            DriverManager.setDriver(DriverFactory.getDriver(browserType));
            DriverManager.getDriver().get("http://google.com");
        }
    }
    public static void quitDriver(){
        if(Objects.nonNull(DriverManager.getDriver())){
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
