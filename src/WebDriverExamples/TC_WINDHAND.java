package WebDriverExamples;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_WINDHAND {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/Sukhil%20Hariharan/Desktop/multiplewindows.html");
        Thread.sleep(4000);
        driver.findElement(By.id("btn2")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("btn3")).click();
        Thread.sleep(4000);
        ArrayList<String> wh=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(wh.get(0));
        Thread.sleep(3000);
        driver.quit();

	}

}
