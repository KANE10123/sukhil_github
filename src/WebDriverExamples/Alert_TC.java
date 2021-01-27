package WebDriverExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class Alert_TC {

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
        System.out.println(driver.getTitle());
        driver.findElement(By.name("txtUserName")).sendKeys("admin");
        driver.findElement(By.name("Submit")).click();
        Thread.sleep(3000);
        Alert Tc = driver.switchTo().alert();
        System.out.println(Tc.getText());
        Tc.accept();
        driver.findElement(By.name("txtPassword")).sendKeys("admin");
        driver.findElement(By.name("Submit")).click();
        Thread.sleep(3000);
        System.out.println("Login completed");
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(4000);
        driver.close();
        
        
        
	}
}
