package WebDriverExamples;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_RobotClass {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
        System.out.println("Application Logged In");
        driver.findElement(By.name("txtUserName")).sendKeys("admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin");
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(4000);
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(4000);
        System.out.println("Logout Completed");
        driver.close();
	}

}