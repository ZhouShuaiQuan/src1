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
//public class MySecondTest {
//
//    IOSDriver driver ;
//    DesiredCapabilities capabilities=new DesiredCapabilities();
//    @Before
//    public void setup() throws MalformedURLException {
//
//        capabilities.setCapability("deviceName","iPhone");
//        capabilities.setCapability("platformName","IOS");
//        capabilities.setCapability("platformVersion","11.4");
//        capabilities.setCapability("app","zsq.DataPickerSample");
//        capabilities.setCapability("noReset",true);
//        capabilities.setCapability("automationName","XCUITest");
//        capabilities.setCapability("udid","efa5d9fb41c9dac92fa9b198e2f4ec0d9119973a");
////        capabilities.setCapability("deviceName","iPhone 5S");
////        capabilities.setCapability("platformName","IOS");
////        capabilities.setCapability("platformVersion","8.3");
////        capabilities.setCapability("app","com.amazon.AmazonCN");
////        capabilities.setCapability("noReset",true);
////        capabilities.setCapability("automationName","XCUITest");
////
//        driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
//
//
//    }
//
//    @After
//    public void teardown(){ driver.quit(); }
//
//    @Test
//    public void selectButton() throws InterruptedException {
//
//        for (int i=0;i<=3;i++) {
//            driver.findElement(By.name("Button")).click();
//            driver.findElement(By.xpath("//XCUIElementTypeTextField")).sendKeys("1240430772@qq.com");
//            driver.findElement(By.xpath("//XCUIElementTypeSecureTextField")).sendKeys("haha0101weqe");
//            new TouchAction(driver).longPress(203, 236).moveTo( 205,383).release().perform();
//            driver.findElement(By.name("Button")).click();
//            driver.hideKeyboard();
//            synchronized (driver)
//            {
//                driver.wait(2000);
////                Thread.sleep(1000);//同
//            }
//            driver.findElement(By.xpath("//XCUIElementTypeTextField")).clear();
//            driver.findElement(By.xpath("//XCUIElementTypeSecureTextField")).clear();
//
//            driver.closeApp();
//
//         //   driver.get("http://www.hao123.com");//转网站
//        //    new TouchAction().longPress(352, 389).moveTo( 139,410).release().perform();
//            driver.launchApp();
//
//            //Set<String> logTypes = driver.manage().logs().getAvailableLogTypes();
//            //LogEntries logEntries = driver.manage().logs().get("driver");
//        }
//    }
//}
