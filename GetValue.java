//import io.appium.java_client.ios.IOSDriver;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class GetValue {
//
//    IOSDriver driver;
//    DesiredCapabilities capabilitie = new DesiredCapabilities();
//
//    @Before
//    public void setup() throws MalformedURLException {
//
//        capabilitie.setCapability("deviceName", "iPhone");
//        capabilitie.setCapability("platformName", "IOS");
//        capabilitie.setCapability("udid","efa5d9fb41c9dac92fa9b198e2f4ec0d9119973a");
//        capabilitie.setCapability("platformVersion", "11.4");
//        capabilitie.setCapability("app", "zsq.DataPickerSample");
//        capabilitie.setCapability("noReset", true);
//        capabilitie.setCapability("automationName", "XCUITest");
//
//        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilitie);
//
//    }
//    @After
//    public void teardown() { driver.quit(); }
//
//    @Test
//
//    public void GeyText() throws InterruptedException {
//
//        String aaa1="//XCUIElementTypeApplication[@name=\"08-tianqi\"]/XCUIElementTypeWindow[1]/" +
//                "XCUIElementTypeOther/XCUIElementTypeTextField[1]";
//        String bbb1="//XCUIElementTypeApplication[@name=\"08-tianqi\"]/XCUIElementTypeWindow[1]/" +
//                "XCUIElementTypeOther/XCUIElementTypeTextField[3]";
//
//        String ccc2;
//
//        Thread.sleep(2000);
//        ccc2=driver.findElement(By.xpath(aaa1)).getText();
//        driver.findElement(By.xpath(bbb1)).sendKeys(ccc2);
//        Thread.sleep(10000);
//
//    }
//}