
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import sun.jvm.hotspot.debugger.posix.elf.ELFSectionHeader;
//import java.awt.*;
import java.lang.annotation.Native;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Time;
import java.time.Duration;
import java.util.prefs.BackingStoreException;


public class ChangeIP {

    IOSDriver driver;
    DesiredCapabilities capabilitie = new DesiredCapabilities();


    @Before
    public void setup() throws MalformedURLException {

        capabilitie.setCapability("deviceName", "iPhone");
        capabilitie.setCapability("platformName", "IOS");
        capabilitie.setCapability("udid","efa5d9fb41c9dac92fa9b198e2f4ec0d9119973a");
        capabilitie.setCapability("platformVersion", "11.4");
        capabilitie.setCapability("app", "com.liguangming.Shadowrocket");
        capabilitie.setCapability("noReset", true);
        capabilitie.setCapability("automationName", "XCUITest");

        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilitie);

    }

    @After
    public void teardown() { driver.quit(); }

    @Test
    public void ChangeIpProcess() throws InterruptedException {
        String switchType="XCUIElementTypeSwitch";
        String buttonMessage="(//XCUIElementTypeButton[@name=\"更多信息\"])[2]";
        String delayTest="延迟测试";
        String timeOut="//XCUIElementTypeStaticText[@name=\"超时\"]";
        String server="//XCUIElementTypeStaticText[@name=\"服务器\"]";
        String ip="23.225.177.96";
        String complete="//XCUIElementTypeButton[@name=\"完成\"]";

        xpathClick(buttonMessage);
        Thread.sleep(1000);
        inputText(server,ip);
        Thread.sleep(1000);
        driver.hideKeyboard("完成");
        xpathClick(complete);
        Thread.sleep(4000);
        typeClickOnly(switchType);
        buttonClick(delayTest);
        Thread.sleep(10000);
//23.225.177.96
        }


    ///输入文本信息（元素xpath，输入值）
    public void inputText(String path,String word) throws InterruptedException {

        WebElement webElement=driver.findElement(By.xpath(path));
        webElement.click();
        Thread.sleep(1000);
        //webElement.sendKeys(Keys.chord(Keys.COMMAND,"a"));
        int nanos = (int) (2 * 1000);
        new TouchAction(driver).press(PointOption.point(170,200)).
                waitAction(WaitOptions.waitOptions(Duration.ofNanos(nanos))).release().perform();
        Thread.sleep(1000);
        new TouchAction(driver).tap(PointOption.point(182, 154)).perform();
        webElement.sendKeys(Keys.DELETE);
        webElement.sendKeys(word);

    }

    ///点击事件（元素名称）
    public void buttonClick(String nameText) {

        driver.findElement(By.name(nameText)).click();
    }

    ///点击事件（元素xpath）
    public void xpathClick(String nameText) {

        driver.findElement(By.xpath(nameText)).click();
    }

    ///类名点击
    public void typeClickOnly(String typeName) {

        driver.findElement(By.className(typeName)).click();
    }
}

