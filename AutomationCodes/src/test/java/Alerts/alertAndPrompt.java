package Alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertAndPrompt {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/alert.html");
       // driver.findElement(By.className("alert")).click();
        // driver.switchTo().alert().accept();
        //String alertText =  driver.switchTo().alert().getText();
        driver.findElement(By.className("prompt")).click();
        driver.switchTo().alert().sendKeys("mera");
        driver.switchTo().alert().accept();
        //System.out.println(alertText);
    }
}
