package waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class wait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/wait.html");
        WebDriverWait wait =  new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(("primary")))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(("cover"))));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(("cover"))));
        driver.findElement(By.className("secondary")).click();

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       /* try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
*/
        //driver.findElement(By.className("primary")).click();
        //driver.findElement(By.className("secondary")).click();

        //driver.quit();
    }
}
