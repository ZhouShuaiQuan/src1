//
//import io.appium.java_client.TouchAction;
//import io.appium.java_client.ios.IOSDriver;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
////import java.awt.*;
//import java.lang.annotation.Native;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.sql.Time;
//
//public class MyThird {
//
//    IOSDriver driver;
//    DesiredCapabilities capabilitie = new DesiredCapabilities();
//
//    @Before
//    public void setup() throws MalformedURLException {
//
//        capabilitie.setCapability("deviceName", "iPhone 8 Plus");
//        capabilitie.setCapability("platformName", "IOS");
//        capabilitie.setCapability("platformVersion", "11.4");
//        capabilitie.setCapability("app", "/Users/zttek/Library/Developer/Xcode/DerivedData/" +
//                "zhou-dfajxfzrcqprdreqkgwopbwutxhy/Build/Products/Debug-iphoneos/zhou.app");
//        capabilitie.setCapability("noReset", true);
//        capabilitie.setCapability("automationName", "XCUITest");
////        capabilities.setCapability("deviceName","iPhone 5S");
////        capabilities.setCapability("platformName","IOS");
////        capabilities.setCapability("platformVersion","8.3");
////        capabilities.setCapability("app","com.amazon.AmazonCN");
////        capabilities.setCapability("noReset",true);
////        capabilities.setCapability("automationName","XCUITest");
////
//        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilitie);
//
//    }
//
//    @After
//    public void teardown() {
//        driver.quit();
//    }
//
//    @Test
//    public void selectButton() throws InterruptedException {
//        for (int i = 0; i <= 3; i++) {
//            driver.findElement(By.name("Button")).click();
//            Thread.sleep(2000);
//            TouchAction perform = (new TouchAction(driver)).tap(257, 513).perform();
//            driver.launchApp();
//
//        }
//    }
//}
