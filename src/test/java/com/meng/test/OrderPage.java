package com.meng.test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class OrderPage {


        private AndroidDriver<MobileElement> driver;
        private By buttonLocator = By.id("button_id");

        public OrderPage(AndroidDriver<MobileElement> driver) {
            this.driver = driver;
        }

        public void clickButton() {
            MobileElement button = driver.findElement(buttonLocator);
            button.click();
        }


}
