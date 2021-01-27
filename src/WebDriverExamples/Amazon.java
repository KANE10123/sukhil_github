package WebDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Amazon {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		if(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
		{
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Games");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
