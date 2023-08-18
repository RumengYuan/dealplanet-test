package com.meng.test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;


public class AppiumTest {

    private AndroidDriver<MobileElement> driver;





   /** @BeforeClass
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:platformVersion", "7.0");
        capabilities.setCapability("appium:deviceName", "MEIZU");
        capabilities.setCapability("appium:ensureWebviewsHavePages", true);
        capabilities.setCapability("appium:nativeWebScreenshot", true);
        capabilities.setCapability("appium:newCommandTimeout", 3600);
        capabilities.setCapability("appium:connectHardwareKeyboard", true);

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        wait = new WebDriverWait(driver, 10);
        loginPage = new LoginPage(driver);
    }
*/


    @BeforeClass
   public void setUp() throws MalformedURLException {
       DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
       desiredCapabilities.setCapability("platformName", "Android");
       desiredCapabilities.setCapability("appium:platformVersion", "9.0");
       desiredCapabilities.setCapability("appium:deviceName", "HUAWEI");
       desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
       desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
       desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
       desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
       URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

       driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }




    @Test
    public void testLogin() throws Exception {
       /**
        * 测试数据
        * MobileElement mobileNumberInput1  = driver.findElementByXPath("//android.view.View[@content-desc=\"+86\"]/android.widget.EditText[1]");
        MobileElement yanzhengma =driver.findElementByXPath("//android.view.View[@content-desc=\"+86\"]/android.widget.EditText[2]");
        MobileElement xieyi =driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView");
        MobileElement loginButton= driver.findElementByAccessibilityId("登录");
//        mobileNumberInput1.click();
//        mobileNumberInput1.sendKeys("15736700510");
//        yanzhengma.click();
//        yanzhengma.sendKeys("1234");
//        loginButton.click();
****预处理弹窗
       MobileElement alertElement = driver.findElementById("android:id/alertTitle");
        if (alertElement.isDisplayed()) {
            String alertTitle = alertElement.getText();
            System.out.println("弹窗标题：" + alertTitle);
            driver.findElementById("android:id/button1").click(); // 点击确定按钮
        }
*/
//初始化页面数据
        LoginPage loginPage = new LoginPage();
        loginPage.setDriver(driver);

        loginPage.mobileNumberInput.click();
        Thread.sleep( 300);
        loginPage.mobileNumberInput.sendKeys("15736700510");
        Thread.sleep( 500);
        loginPage.agreement.click();
        Thread.sleep( 300);

        loginPage.getCode.click();
        Thread.sleep( 300);

        Assert.assertNotEquals(loginPage.getCode.getText(), "重新发送");

        loginPage.codeInput.click();
        Thread.sleep( 100);
        loginPage.codeInput.sendKeys("1234");
        Thread.sleep( 500);

        loginPage.loginButton.click();

        Thread.sleep( 2000);

        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains("星球部落"), "登录失败");
    }





    @Test
public void planeTest()throws Exception {

        PlanetPage planetPage = new PlanetPage();
        planetPage.setDriver(driver);


        planetPage.callSteward.click();
        Thread.sleep( 300);
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains("选择管家"), "召唤管家异常");

        planetPage.backButton.click();
        Thread.sleep( 500);


        planetPage.searchIcon.click();
        Thread.sleep( 500);
        Assert.assertTrue(pageSource.contains("最近搜索"), "搜索页面异常");

        planetPage.searchContextInput.click();
        Thread.sleep( 100);

        planetPage.searchContextInput.sendKeys("自动化测试");
        Thread.sleep( 100);

        planetPage.trueButton.click();
        Thread.sleep( 300);
        Assert.assertTrue(pageSource.contains("自动化测试"), "搜索结果异常");
        Thread.sleep( 500);

        planetPage.falseButton.click();
        Thread.sleep( 300);

        planetPage.backButton.click();
        Thread.sleep( 300);
        planetPage.NO1planet.click();

        Assert.assertTrue(pageSource.contains("星球介绍"), "星球信息页面异常");
        Thread.sleep( 300);
        planetPage.agreementButton.click();
        Thread.sleep( 300);
        planetPage.joinPlanetButton.click();
        planetPage.socialPlanet.click();
        Thread.sleep( 300);
        planetPage.travelPlanet.click();
        Thread.sleep( 300);
        planetPage.wisdomPlanet.click();
        Thread.sleep( 300);




    }





    @Test
    public void stationTest(){

        PlanetPage planetPage = new PlanetPage();
        planetPage.setDriver(driver);














    }


    @AfterClass
    public void tearDown() throws Exception {
        if (driver != null) {
            driver.quit();
        }
    }
}