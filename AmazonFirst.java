
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import jdk.nashorn.internal.ir.WhileNode;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import sun.jvm.hotspot.debugger.posix.elf.ELFSectionHeader;
//import java.awt.*;
import java.lang.annotation.Native;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Time;
import java.time.Duration;

public class  AmazonFirst{

    IOSDriver driver;
    DesiredCapabilities capabilitie = new DesiredCapabilities();

    @Before
    public void setup() throws MalformedURLException {

        capabilitie.setCapability("deviceName", "iPhone");
        capabilitie.setCapability("platformName", "IOS");
        capabilitie.setCapability("udid","efa5d9fb41c9dac92fa9b198e2f4ec0d9119973a");
        capabilitie.setCapability("platformVersion", "11.4");
        capabilitie.setCapability("app", "com.amazon.AmazonCN");
        capabilitie.setCapability("noReset", true);
        capabilitie.setCapability("automationName", "XCUITest");

        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilitie);

    }

    @After
    public void teardown() { driver.quit(); }

    @Test
    public void selectButton() throws InterruptedException {

        //登录1
        String firstMenu_UK="nav_menu_button";
        String myAccount_UK="HELLO. SIGN IN";
        String namePath_UK="//XCUIElementTypeOther[@name=\"Amazon Sign In\"]/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeTextField";
        String nameWord_UK="1240430772@qq.com";
        String continue_UK="Continue";
        String keyPath_UK="//XCUIElementTypeOther[@name=\"Amazon Sign In\"]/" +
                "XCUIElementTypeOther[4]/XCUIElementTypeSecureTextField";
        String keyWord_UK="Zhou19960504";

        //退出登录1
        int setting_x1=180,setting_y1=430,setting_x2=180,setting_y2=240;
        String setting_UK="Settings";
        String signOutName_UK="Sign out";
        String signOut_UK="Sign Out";

        //搜索产品1
        String searchClink_UK="XCUIElementTypeSearchField";
        String searchWord_UK="iphone 8 plus";
        //int SwipeSearchProduct_x1=200,SwipeSearchProduct_y1=500,SwipeSearchProduct_x2=279,SwipeSearchProduct_y2=252;
        String ProductName_UK="Apple iPhone X, GSM Unlocked 5.8\", 256 GB - Space Gray";

        //浏览加购1
        int SwipePicture_x1=259,SwipePicture_y1=330,SwipePicture_x2=38,SwipePicture_y2=326;
        String addToCart_UK="Add to Cart";
        String addToList_UK="ADD TO LIST";
        String back_UK="Back";

//        buttonClick(firstMenu_UK);
//        boolean myAccount_UK_Bool = buttonClick_Bool(myAccount_UK);
//        if(myAccount_UK_Bool)
//        {
//            //退出实现2
//            mouseSwipe(setting_x1,setting_y1,setting_x2,setting_y2);
//            buttonClick(setting_UK);
//            //buttonClick(signOutName_UK);
//            Thread.sleep(3000);
//            new TouchAction(driver).tap(PointOption.point(47, 500)).perform();
//            //driver.findElement(By.name("Sign out")).click();
//            Thread.sleep(3000);
//            buttonClick(signOut_UK);
//        }
//        else
//        {
//            //登录实现2
//            Thread.sleep(5000);
//            inputText(namePath_UK,nameWord_UK);
//            buttonClick(continue_UK);
//            Thread.sleep(4000);
//            inputText(keyPath_UK,keyWord_UK);
//            driver.hideKeyboard();
//            Thread.sleep(5000);
//        }


        //搜索产品实现
        Thread.sleep(2000);
        typeClick(searchClink_UK,searchWord_UK);
        //inputText(search_UK,searchWord_UK);
        driver.hideKeyboard();
        Thread.sleep(3000);
        do{

            mouseBestSwipe();
            Thread.sleep(2000);
        }while (buttonClick_Bool(ProductName_UK));
        Thread.sleep(3000);
//        for(int i=0;i<=4;i++)
//        {
//            Thread.sleep(3000);
//            mouseSwipe(SwipePicture_x1,SwipePicture_y1,SwipePicture_x2,SwipePicture_y2);
//        }
        do{

            mouseBestSwipe();
            Thread.sleep(2000);
        }while (buttonClick_Bool(addToCart_UK));
        Thread.sleep(3000);
//        String firstMenu="显示导航菜单";(中国切换美国)
//        String setting="anx_nav_menu_front";
//        String country="国家和语言";
//        String country_Language="国家或地区: 中国";
//        String usa="美国 United States - Amazon.com";
//        String language="English 英语";
//        String done="Done";
//        int language_x1=236,language_y1=486,language_x2=213,language_y2=117;
//
//
//        buttonClick(firstMenu);
//        buttonClick(setting);
//        buttonClick(country);
//        Thread.sleep(5000);
//        buttonClick(country_Language);
//        Thread.sleep(5000);
//        mouseSwipe(language_x1,language_y1,language_x2,language_y2);
//        buttonClick(usa);
//        buttonClick(language);
//        buttonClick(done);
//        Thread.sleep(5000);

////        String firstMenu="显示导航菜单";（中国登陆）
//        String myAccount="我的账户";
//        String logIn="请登录";
//        String namePath="//XCUIElementTypeOther[@name=\"手机号/邮箱\"]";
//        String keyPath="//XCUIElementTypeStaticText[@name=\"Amazon密码\"]";
//        String nameWord="1240430772@qq.com";
//        String keyWord="Zhou19960504";
//        String logIn_Second="登录";
//
//        buttonClick(firstMenu);
////        buttonClick(myAccount);
//        buttonClick(logIn);
//        Thread.sleep(2000);
//        inputText(namePath,nameWord);
//        inputText(keyPath,keyWord);
//        driver.hideKeyboard();
//        buttonClick(logIn_Second);
//        Thread.sleep(5000);

    }



    ///输入文本信息（元素xpath，输入值）
    public void inputText(String path,String word) {

        WebElement webElement=driver.findElement(By.xpath(path));
        webElement.click();
        webElement.sendKeys(word);
    }

    ///点击事件（元素名称）
    public void buttonClick(String nameText) {

        driver.findElement(By.name(nameText)).click();
    }

    ///点击事件boolean找到返回false（元素名称）
    public boolean buttonClick_Bool(String nameText) {
            try {

                WebElement error_message =driver.findElement(By.name(nameText));
                if(error_message.isDisplayed()){

                    error_message.click();
                    return false;
                }
            }
            catch (Exception ex) {}
        return true;
    }
    ///类名点击
    public void typeClick(String typeName,String typeWord)
    {

        driver.findElement(By.className(typeName)).sendKeys(typeWord);
    }
    ///滑动
    public void mouseSwipe(int x1,int y1,int x2,int y2) {

        int nanos = (int) (2 * 1000);
        new TouchAction(driver).longPress(PointOption.point(x1, y1)).
                waitAction(WaitOptions.waitOptions(Duration.ofNanos(nanos))).
                moveTo(PointOption.point(x2, y2)).release().perform();
    }
    ///黄金滑动：正常人的浏览
    public void mouseBestSwipe() {

        int nanos = (int) (2 * 1000);
        new TouchAction(driver).longPress(PointOption.point(200, 500)).
                waitAction(WaitOptions.waitOptions(Duration.ofNanos(nanos))).
                moveTo(PointOption.point(279, 282)).release().perform();
    }

}

