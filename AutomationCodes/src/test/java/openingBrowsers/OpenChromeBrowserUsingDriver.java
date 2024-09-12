package openingBrowsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowserUsingDriver {
public static void main(String[] args){

 //System.out.println("hello java");
 //System.setProperty("webdriver.chrome.driver","src/test/resources/ ");
 WebDriverManager.chromedriver().setup();
 WebDriver driver = new ChromeDriver();
}

}
