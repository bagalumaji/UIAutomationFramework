package com.bagal.tests;

import com.bagal.base.BaseTest;
import com.bagal.constants.FrameworkConstants;
import com.bagal.pojo.UserAccountTestData;
import com.bagal.reports.ExtentLogger;
import com.bagal.reports.ExtentReport;
import com.bagal.utils.ExcelReader;
import io.github.sskorol.core.DataSupplier;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import java.util.List;

import static com.bagal.config.FrameConfigReader.getConfig;
import static com.bagal.reports.ExtentLogger.info;
import static com.bagal.reports.ExtentLogger.pass;

public class DemoTest extends BaseTest {
    @Test(description = "demo test")
    public void demoTest(){
        ExtentReport.createTest("demo test");
        info("");
        System.out.println(getConfig().browser());
        info(getConfig().browser().toString());
        System.out.println(getConfig().pageLoadTimeout());
        info("page load timeout"+getConfig().pageLoadTimeout());
        System.out.println(getConfig().url());
        info("url : "+getConfig().url());
        System.out.println(getConfig().explicitWaitTimeout());
        Assert.fail();
    }

    @Test(dataProvider="getUserAccountData",description = "read excel test data")
    public void readExcelTestData(UserAccountTestData userAccountTestData){
        System.out.println("userAccountTestData.getUserName() = " + userAccountTestData.getUserName());
        System.out.println("userAccountTestData.getPassword() = " + userAccountTestData.getPassword());
        ExtentReport.createTest("read excel test data");
        info("userAccountTestData.getUserName() = " + userAccountTestData.getUserName());
        info("userAccountTestData.getPassword() = " + userAccountTestData.getPassword());
        pass("test passed");
    }

    @DataSupplier
    public List<UserAccountTestData> getUserAccountData(){
        return ExcelReader.getExcelData(new FrameworkConstants().getUserAccountTestDataFilePath(), "useraccounttestdata");
    }
}
