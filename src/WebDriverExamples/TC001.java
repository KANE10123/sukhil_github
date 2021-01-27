package WebDriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC001 {

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		Thread.sleep(3000);
		System.out.println("Application Opened");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login Completed");
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		System.out.println("application closed");
		driver.close();
		
		
		
	}

}
