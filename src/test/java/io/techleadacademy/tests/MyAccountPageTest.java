package io.techleadacademy.tests;

import io.techleadacademy.pages.HomePage;
import io.techleadacademy.pages.MyAccountPage;
import io.techleadacademy.util.DateUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountPageTest extends MyAccountPage {
    public MyAccountPageTest(){
        super();
    }
    @Test
    public void verifyMyPageTitle(){
        String actual = driver.getTitle();
        Assert.assertEquals(actual, "My Account");
    }
    @Test
    public void verifyMyName(){
        String actual = driver.findElement(By.xpath("//h3[@class='text-align-left']")).getText();
        Assert.assertEquals(actual, driver.findElement(By.xpath("//h3[@class='text-align-left']")).getText());
    }
    @Test
    public void verifyDate(){

        String actual = driver.findElement(By.xpath("//span[@class='h4']")).getText();
        Assert.assertEquals(actual,DateUtils.getCurrentFormattedDate());
    }
    @Test
    public void navigateToMyAccountPage(){
        HomePage homePage = new HomePage();
        homePage.clickSignUp();
        MyAccountPage myAccPage = new MyAccountPage();
    }
}
