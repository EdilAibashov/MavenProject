package io.techleadacademy.util;

import io.techleadacademy.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

//public class Waits extends TestBase {

//    public Waits(){
//        super();
//        PageFactory.initElements(driver, this);
//    }
//    public static void waitForClickable(WebElement element) {
//        WebDriverWait explicitWait = new WebDriverWait(driver, 10);
//        explicitWait.until(ExpectedConditions.elementToBeClickable(element));
//    }
//
//    public static void waitForVisibilityOfAll(List<WebElement> element) {
//        WebDriverWait explicitWait = new WebDriverWait(driver, 10);
//        explicitWait.until(ExpectedConditions.visibilityOfAllElements(element));
//    }
//
//    public static void waitForVisibility(WebElement element) {
//        WebDriverWait explicitWait = new WebDriverWait(driver, 10);
//        explicitWait.until(ExpectedConditions.visibilityOf(element));
//    }
//    public static void sleep(int milliseconds) {
//        try {
//            Thread.sleep(milliseconds);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//    public static void click(WebElement element){
//        waitForClickable(element);
//        element.click();
//
//    }
//    public static void sendKeys(WebElement element, String input){
//        waitForClickable(element);
//        element.sendKeys();
//    }
//    public static void getText(WebElement element){
//        waitForClickable(element);
//        element.getText();
//    }
//    public static void moveIntoView(WebElement element){
//        try {
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//}
