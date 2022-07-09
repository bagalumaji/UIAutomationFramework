package com.bagal.driver;

import org.openqa.selenium.WebDriver;

import java.util.Objects;

public final class DriverManager {
    private DriverManager(){}
    private final static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

    public static WebDriver getDriver(){
        return threadLocalDriver.get();
    }
    static void setDriver(WebDriver driver){
        if(Objects.nonNull(driver)){
            threadLocalDriver.set(driver);
        }
    }
    public static void unload(){
        threadLocalDriver.remove();
    }
}
