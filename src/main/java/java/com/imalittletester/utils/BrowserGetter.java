package java.com.imalittletester.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class BrowserGetter {

    public WebDriver getDriver() {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        return chromeDriver;
    }
}
