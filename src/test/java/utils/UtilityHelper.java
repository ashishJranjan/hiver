package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.*;

public class UtilityHelper {
    public WebElement findElementByXpath(WebDriver driver, String webElement){
        try{
            WebElement element;
            element = driver.findElement(By.xpath(webElement));
            return element;
        }
        catch (Exception e) {
            return null;
        }

    }

    public List<WebElement> findElementsByXpath(WebDriver driver, String webElement){

        try{
            List<WebElement> elements;
            elements = driver.findElements(By.xpath(webElement));
            return elements;
        }
        catch (Exception e) {
            return null;
        }

    }
}
