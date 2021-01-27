package WebDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TC_Frame {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
        System.out.println(driver.getTitle());
        driver.findElement(By.name("txtUserName")).sendKeys("admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin");
        driver.findElement(By.name("Submit")).click();
        Thread.sleep(3000);
        System.out.println("Login completed");
        driver.switchTo().frame("rightMenu");
        Thread.sleep(3000);
        System.out.println("Click on Add button");
        driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
        driver.findElement(By.name("txtEmpFirstName")).sendKeys("selenium");
        driver.findElement(By.id("txtEmpLastName")).sendKeys("Sukhil");
        driver.findElement(By.name("txtEmpNickName")).sendKeys("subramaninam");
        WebElement fileInput = driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
        fileInput.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Sand-dunes-Sahara-Morocco-Merzouga.jpg");
        Thread.sleep(5000);
        System.out.println("File Uploaded Sucessfully");
        driver.findElement(By.id("btnEdit")).click();
        System.out.println("Saved the Employee Details");
        Thread.sleep(5000);
        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(5000);
        System.out.println("Application Closed");
        driver.close();
	}

}
