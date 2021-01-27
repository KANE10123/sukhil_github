package WebDriverExamples;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_002 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("clear")).click();
		System.out.println("clear the username and password");
		Thread.sleep(3000);
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		System.out.println("click on login button");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
	    r.keyRelease(KeyEvent.VK_TAB);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		System.out.println("Entering Frame");
		driver.switchTo().frame("rightMenu");
	    Thread.sleep(3000);
	    System.out.println("Click on Add button");
	    driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
		Thread.sleep(6000);
		System.out.println("Application closed");
		driver.close();

	}

}
