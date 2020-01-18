import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Scanner;

public class Pyramyd {
    @Test
    public static void captureScreenMethod() throws Exception{
        System.setProperty("webdriver.chrome.driver","/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try{
            driver.get("https://www.softwaretestingmaterial.com");
            driver.navigate().refresh();
            //driver.findElement(By.xpath("//*[@id='cse-search-box']/div/input[4]")).sendKeys("agile"); //Statement with correct Xpath
            driver.findElement(By.xpath("//*[@id='cse']")).sendKeys("agile"); //Statement with incorrect Xpath
        }catch(Exception e){
            File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File("/Users/edilaibashov/Desktop/SoftwareTestingMaterial.png"));
        }
        driver.close();
        driver.quit();
    }
}
//    int i, j, k,number;
//   Scanner user_input;
//    public Pyramyd(){
//        user_input = new Scanner(System.in);
//        System.out.println("Enter number of pyramid");
//        number = user_input.nextInt();
//
//        for (i = 1; i <= number; i++){
//            for (j = i; j < number;j++)
//                System.out.print(" ");
//            for (k = 1; k < (i * 2);k++)
//                System.out.print("*");
//            System.out.print("\n");
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Pyramyd obj = new Pyramyd();
//
//
//    }

