
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;
    static WebDriverWait wait1;
    static WebDriverWait wait2;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\nazhivka.by\\IdeaProjects\\testselenium\\drivers\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nazhivka.by\\IdeaProjects\\testselenium\\drivers\\chromedriver.exe");
        driver = new FirefoxDriver();
        //driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        WebElement link=driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab'][1]/a"));
        Actions actions=new Actions(driver);
        actions.moveToElement(link).build().perform();



    }



}
