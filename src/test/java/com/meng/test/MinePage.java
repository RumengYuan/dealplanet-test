package com.meng.test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MinePage {
    private AndroidDriver<MobileElement> driver;
    MobileElement mobileNumberInput =null;

    public MinePage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public MinePage() {
    }

    public void setDriver(AndroidDriver<MobileElement> driver){
        this.driver=driver;
        mobileNumberInput= driver.findElementByXPath("//android.view.View[@content-desc=\"+86\"]/android.widget.EditText[1]");


    }
}
