package io.techleadacademy.pages;

import io.techleadacademy.base.TestBase;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends TestBase {
    public BasePage(){
        super();
        PageFactory.initElements(driver,this);
    }
}
