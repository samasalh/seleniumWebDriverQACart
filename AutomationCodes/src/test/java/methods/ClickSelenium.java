package methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class ClickSelenium {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/actions.html");

        driver.findElement(By.cssSelector("[name='firstName']")).sendKeys("Samar");
        driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Saleh");
        //driver.findElement(By.xpath("//*[@class='checkbox-item']")).click();
        // driver.findElement(By.id("web")).click();
       //boolean web=  driver.findElement(By.id("web")).isSelected();
        //System.out.println(web);

        //Select dropDawnMenu =new Select(driver.findElement(By.id("level")));
       // dropDawnMenu.selectByIndex(1);
        //driver.findElement(By.cssSelector("#actions-button")).click();
       //boolean Name = driver.findElement(By.cssSelector("[name='firstName']")).isDisplayed();
        //boolean Name = driver.findElement(By.cssSelector("[name='firstName']")).isEnabled();
        //String Name= driver.findElement(By.id("web")).getAttribute("value");//getting attribute name
        //String Name= driver.findElement(By.id("web")).getTagName();
       // String Name= driver.findElement(By.id("web")).getCssValue("cursor");
       // Point  point = driver.findElement(By.id("web")).getLocation();
       // Dimension dimension  =driver.findElement(By.id("web")).getSize();
       // Rectangle rectangle  =driver.findElement(By.id("web")).getRect();
       //String Name = driver.findElement(By.cssSelector("[name='firstName']")).getAccessibleName();
       // String Name = driver.findElement(By.cssSelector("[name='firstName']")).getAriaRole();
        //System.out.println( Name);
        Actions action =new Actions(driver);
       // action.doubleClick(driver.findElement(By.cssSelector("[name='firstName']"))).perform();
       // action.contextClick(driver.findElement(By.cssSelector("[name='firstName']"))).perform();
       // action.moveToElement( driver.findElement(By.id("web"))).perform();
        WebElement source= driver.findElement(By.className(".source"));
        WebElement destination= driver.findElement(By.className(".destination"));
        //action.dragAndDrop(source,destination);
        action.clickAndHold(source).moveToElement(destination).release().build().perform();
      //driver.quit();

    }
}
