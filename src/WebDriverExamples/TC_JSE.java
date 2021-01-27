package WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_JSE {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
        System.out.println(driver.getTitle());
        driver.findElement(By.name("txtUserName")).sendKeys("admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin");
        WebElement element = driver.findElement(By.name("Submit"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(3000);
        System.out.println("Login completed");
        WebElement logout = driver.findElement(By.linkText("Logout"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click();", logout);
        Thread.sleep(3000);
        System.out.println("Logout completed");
        driver.close();

	}

}
