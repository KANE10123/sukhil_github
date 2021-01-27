package WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Google2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(10);
        driver.findElement(By.name("q")).sendKeys("Sukhil Hariharan");
        Thread.sleep(4000);
        driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
        System.out.println("Firsttime down arrow pressed");
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(3000);
        System.out.println("Second time down arrow pressed");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        System.out.println("clicked on Enter btn");
        Thread.sleep(4000);
        driver.close();

	}

}
