package com.meng.test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage{
    private AndroidDriver<MobileElement> driver;
    MobileElement mobileNumberInput =null;
    MobileElement codeInput =null;

    MobileElement getCode=null;

    MobileElement agreement =null;
    MobileElement loginButton=null;
    public LoginPage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }
    public LoginPage() {
    }

    public void setDriver(AndroidDriver<MobileElement> driver){
        this.driver=driver;
        mobileNumberInput= driver.findElementByXPath("//android.view.View[@content-desc=\"+86\"]/android.widget.EditText[1]");
         codeInput =driver.findElementByXPath("//android.view.View[@content-desc=\"+86\"]/android.widget.EditText[2]");
        getCode =driver.findElementByXPath("//android.view.View[@content-desc=\"获取验证码\"]\n");
         agreement =(MobileElement) driver.findElementByAccessibilityId("我已阅读并同意");
         loginButton= driver.findElementByAccessibilityId("登录");

    }
}

