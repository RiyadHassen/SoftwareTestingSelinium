import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Autotest {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Geko\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://gmail.com");
        System.out.println("Successfully opened the website in gmail");

        WebDriverWait wait = new WebDriverWait(driver, 50);
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")));
        input.sendKeys("riyadworku@gmail.com");
        System.out.println("Email entererd");
        WebElement next_Button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierNext")));
        next_Button.click();
        System.out.println("Next Button cliked");
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password.sendKeys("fillpassword");
        System.out.println("Password entered");
        WebElement next_password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwordNext")));
        next_password.click();
        System.out.println("login cliked");
        WebElement webElements = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id=':2o']/tbody/tr[@class='zA zE']")));
        List<WebElement> unreadedEmails = driver.findElements(By.xpath("//table[@id=':2o']/tbody/tr[@class='zA zE']"));
        System.out.println(unreadedEmails.size());
        Thread.sleep(50000);
        driver.quit();

    }
}