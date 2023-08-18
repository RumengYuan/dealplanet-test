package com.meng.test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class PlanetPage {

    MobileElement tabIcon =null;
    MobileElement socialPlanet =null;
    MobileElement wisdomPlanet =null;
    MobileElement callSteward =null;
    MobileElement  searchIcon =null;
    MobileElement trueButton  =null;
    MobileElement  falseButton =null;
    MobileElement   backButton =null;
    MobileElement  NO1planet =null;
    MobileElement  travelPlanet =null;
    MobileElement agreementButton=null;
    MobileElement joinPlanetButton=null;
    MobileElement searchContextInput=null;




    private AndroidDriver<MobileElement> driver;
        private By buttonLocator = By.id("button_id");

        public PlanetPage(AndroidDriver<MobileElement> driver) {
            this.driver = driver;
        }

    public PlanetPage() {
    }


    public void setDriver(AndroidDriver<MobileElement> driver){
        this.driver=driver;


        tabIcon =  driver.findElementByAccessibilityId("星球部落\n第 3 个标签，共 4 个");

        socialPlanet= (MobileElement) driver.findElementByAccessibilityId("社交星球");
        wisdomPlanet  = (MobileElement) driver.findElementByAccessibilityId("智慧星球");
        callSteward = (MobileElement) driver.findElementByAccessibilityId("召唤管家");
        searchIcon = (MobileElement) driver.findElementByXPath("//android.view.View[@content-desc=\"爱好星球\n有趣\"]/android.widget.ImageView[2]");
        trueButton = (MobileElement) driver.findElementByAccessibilityId("确定");
        falseButton= driver.findElementByAccessibilityId("取消");
        backButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView");
        NO1planet = (MobileElement) driver.findElementByXPath("android.widget.ImageView[1]");
        travelPlanet = (MobileElement) driver.findElementByAccessibilityId("旅游星球");
        agreementButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[5]/android.widget.ImageView");
        joinPlanetButton = (MobileElement) driver.findElementByAccessibilityId("立即加入");
        searchContextInput = (MobileElement) driver.findElementByClassName("android.widget.EditText");



    }

}
