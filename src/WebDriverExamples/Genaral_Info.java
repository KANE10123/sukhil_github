package WebDriverExamples;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Genaral_Info {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		System.out.println("Browser Opened");
        Thread.sleep(5000);
        driver.findElement(By.name("txtUserName")).sendKeys("admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin");
        Robot s = new Robot();
        s.keyPress(KeyEvent.VK_TAB);
        s.keyRelease(KeyEvent.VK_TAB);
        s.keyPress(KeyEvent.VK_ENTER);
        s.keyRelease(KeyEvent.VK_ENTER);
        System.out.println("next page opened");
        Thread.sleep(4000);
        System.out.println("closing application");
        driver.close();
        
        
	}

}
