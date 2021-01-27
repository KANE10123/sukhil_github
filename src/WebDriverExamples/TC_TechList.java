package WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public abstract class TC_TechList {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
		System.out.println("Webpage opened");
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		driver.findElement(By.name("firstname")).sendKeys("kevin");
		driver.findElement(By.name("lastname")).sendKeys("Hart");
		Thread.sleep(5000);
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.xpath("//*[@id=\"exp-1\"]")).click();
		driver.findElement(By.id("datepicker")).sendKeys("13/11/1998");
		driver.findElement(By.id("profession-0")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("tool-2")).click();
		Select box  = new Select(driver.findElement(By.id("continents")));
		Thread.sleep(4000);
		box.selectByVisibleText("Asia");
		box.selectByIndex(1);
		Thread.sleep(4000);
		Select box1 = new Select(driver.findElement(By.id("selenium_commands")));
		Thread.sleep(4000);
		box1.selectByVisibleText("Navigation Commands");
		Thread.sleep(5000);
		box1.selectByIndex(1);
		WebElement FileInput = driver.findElement(By.xpath("//*[@id=\"photo\"]"));
		FileInput.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Sand-dunes-Sahara-Morocco-Merzouga.jpg");
		Thread.sleep(5000);
		driver.close();
		
	}

}
