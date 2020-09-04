package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Setup {

    public WebDriver initializeDriver(String driver) throws Exception {
        WebDriver webDriver = null;
        switch (driver) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                webDriver = new ChromeDriver();
                break;
            case "htmlUnit":
               //
                break;
            case "fireFox":
                WebDriverManager.firefoxdriver().setup();
                webDriver = new FirefoxDriver();
        }
        return webDriver;


    }
}
