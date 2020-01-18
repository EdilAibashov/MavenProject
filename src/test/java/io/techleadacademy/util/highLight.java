package io.techleadacademy.util;

import io.techleadacademy.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class highLight extends TestBase {
    public highLight(){
        super();
        PageFactory.initElements(driver, this);
    }

    public static void highlightElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //moveElementIntoView(element);
        for(int i = 0; i < 2; i++){
            try{
                if (i == 0) {
                    js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: black; border: 3px solid red; background: yellow");
                }else{
                    SeleniumUtils.sleep(2000);
                    js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
