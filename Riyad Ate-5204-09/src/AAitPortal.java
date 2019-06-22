import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;


public class AAitPortal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Geko\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://portal.aait.edu.et");
        System.out.println("Successfully opened the website localhost");

        WebDriverWait wait = new WebDriverWait(driver, 50);
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("UserName")));
        input.sendKeys("ATE/5204/09");
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Password")));
        password.sendKeys("fillpassword");
        WebElement next_password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/button[@class='btn btn-success']")));
        next_password.click();
        WebElement grade_report = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Grade & Results")));
        grade_report.click();
        WebElement grade = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Grade Report")));
        grade.click();
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            String dest = "C:\\Users\\18573\\Downloads\\grade.png";
            File destinaion = new File(dest);
            FileHandler.copy(source, destinaion);
        }
        catch (IOException e){
             e.getMessage();
        }


//        WebElement webEmail = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@selector='unread']/div")));
//        System.out.println(webEmail.getSize());
        Thread.sleep(50000);
        driver.quit();

//table[@id=':2o']/tbody/tr[@class='zA zE

    }

}