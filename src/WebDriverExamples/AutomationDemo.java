package WebDriverExamples;
//importing the Packages
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class AutomationDemo {

	public static void main(String[] args) throws Exception{
	                       // property of that webdriver is chrome.driver                   
		                //where you saved the path of chromedriver in ur system
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // we created a object 
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		// driver will navigate to the website
		System.out.println("Application Opened");
		if(driver.getTitle().equals("Register"))
		{
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("sukhil");
		// driver will find the element of that path like class or id and senkeys means it is a textbox.
		Thread.sleep(4000);// it will sleep for how many seconds the website will be opened.
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("hariharan");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(2) > div > textarea")).sendKeys("serne park");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input")).sendKeys("sukhil@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("9967671044");
		Thread.sleep(5000);
		System.out.println("Application Closed");
		driver.close();
	}

}
