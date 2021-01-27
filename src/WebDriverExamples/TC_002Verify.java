package WebDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class TC_002Verify {

	public static void main(String[] args) throws Exception {
		
		String username = "admin";
		String password = "admin";
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		//verify
		//actual result
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");
		Thread.sleep(3000);
		//mouse over
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		System.out.println("Mouse over completed");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("clicked on submenu");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("application closed");
		driver.close();
	}

}
