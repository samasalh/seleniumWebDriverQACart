package Frames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/frames.html");
        WebElement oneFrame = driver.findElement(By.id("qacart"));
        driver.switchTo().frame(oneFrame);
        driver.findElement(By.cssSelector("[name=firstName]")).sendKeys("Samar");


/*
        //nested frames
        driver.switchTo().frame("menu");
        driver.switchTo().frame("links");
        driver.findElement(By.className("locators")).click();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
       String name= driver.findElement(By.tagName("p")).getText();
       System.out.println(name);

 */
    }
}
