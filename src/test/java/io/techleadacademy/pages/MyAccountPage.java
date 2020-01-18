package io.techleadacademy.pages;

import io.techleadacademy.base.TestBase;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends TestBase {

    public MyAccountPage(){
        super();
        PageFactory.initElements(driver, this);
    }
    public String getTitle() {
        return driver.getTitle();

    }

}
