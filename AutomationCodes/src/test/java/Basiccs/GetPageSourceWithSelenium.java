package Basiccs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceWithSelenium {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.qacart.com/");
        String PageSource = driver.getPageSource();
        System.out.println(" The PageSource Title is :" + PageSource);
    }
    }
