package FindElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();


        driver.get("https://hatem-hatamleh.github.io/Selenium-html/locators.html");


        //String elementTEXT= driver.findElement(By.tagName("li")).getText();
        // String elementTEXT= driver.findElement(By.className("mobile")).getText();
        //String elementTEXT= driver.findElement(By.name("appium")).getText();
       // String elementTEXT= driver.findElement(By.id("welcome")).getText();

        //driver.get("file://C:\\Users\\pc\\IdeaProjects\\AutomationCodes\\src\\test\\resources\\index.html");
       // String elementTEXT= driver.findElement(By.linkText("Locators")).getText();
        //String elementTEXT= driver.findElement(By.partialLinkText("Lo")).getText();
       // String elementTEXT= driver.findElement(By.xpath("//html/body/div/div/a[6]")).getText();
       // String elementTEXT= driver.findElement(By.xpath("//html/body/div/div/a[6]")).getText();
        //String elementTEXT= driver.findElement(By.xpath("//*[contains(@class,'frames')]")).getText();
        // String elementTEXT= driver.findElement(By.xpath("//*[contains(text(), 'Selenium')]")).getText();
        //String elementTEXT= driver.findElement(By.xpath("//*[text()='Selenium']")).getText();
        //String elementTEXT= driver.findElement(By.cssSelector("#welcome")).getText();
        //String elementTEXT= driver.findElement(By.cssSelector(".wrapper")).getText();
        //String elementTEXT= driver.findElement(By.cssSelector("[name=appium]")).getText();
        //String elementTEXT= driver.findElement(By.cssSelector(".wrapper .web")).getText();
       // String elementTEXT= driver.findElement(By.cssSelector(".wrapper   li:nth-of-type(4)")).getText();
       // By welcomeHeader = By.id("welcome");
        //String elementTEXT= driver.findElement( welcomeHeader).getText();
         // WebElement welcomeHeader=driver.findElement( By.id("welcome"));
       // String elementTEXT= welcomeHeader.getText();
        //String elementTEXT= driver.findElements(By.cssSelector(".wrapper   li")).get(1).getText();
        List<WebElement> courseList = driver.findElements(By.cssSelector(".wrapper   li"));
        // String elementTEXT=courseList.get(1).getText();
        int elementTEXT = courseList.size();
        System.out.println(elementTEXT);
   driver.quit();






    }
}
