package WebDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Demo_1 {

	public static void main(String[] args) throws Exception{
        
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/");
        driver.findElement(By.id("email")).sendKeys("sukhil@gmail.com");
        Thread.sleep(6000);
        driver.findElement(By.id("enterimg")).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Nikhil");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(3) > input")).sendKeys("Hariharan");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea")).sendKeys("Serene Park Hyderabad");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("sukhil@gmail.com");
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("9237676378");
        Thread.sleep(7000);
        driver.findElement(By.name("radiooptions")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("checkbox1")).click();
        Thread.sleep(4000);
        driver.close();
	}

}
