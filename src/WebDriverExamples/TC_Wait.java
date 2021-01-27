package WebDriverExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_Wait {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
        driver.findElement(By.name("txtUserName")).sendKeys("admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin");
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='Submit']")));
        driver.findElement(By.xpath("//input[@type='Submit']")).click();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        System.out.println("Login completed");
        driver.findElement(By.xpath("//*[@id='option-menu']/li[3]/a")).click();
        Thread.sleep(4000);
        System.out.println("Application Closed");
        driver.close();
	}

}
