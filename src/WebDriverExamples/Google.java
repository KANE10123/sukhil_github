package WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("sukhil hariharan");
		Thread.sleep(5000);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(5000);
        
	}

}
