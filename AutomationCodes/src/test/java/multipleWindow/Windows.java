package multipleWindow;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Windows {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/windows.html");
        String parent=driver.getWindowHandle();
        System.out.println(parent);
        driver.findElement(By.cssSelector(".website")).click();
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println(allWindows);
        System.out.println(driver.getTitle());
        for(String window:allWindows ){
            if (!window.equalsIgnoreCase(parent)){
                driver.switchTo().window(window);
                System.out.println(driver.getTitle());
                driver.close();
               // driver.quit();
        }}
                driver.switchTo().window(parent);
                driver.findElement(By.className("youtube")).click();
    }
}
