package WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_DropDown {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("file:///C:/Users/Sukhil%20Hariharan/Desktop/dropdownNavigate.html");
        Select drpdwn = new Select(driver.findElement(By.name("OptWeb")));
        drpdwn.selectByVisibleText("Google");
        driver.findElement(By.xpath ("html/body/form/input")).click();
        Thread.sleep (5000);
        System.out.println(driver.getTitle());
        driver.navigate().back();
        Thread.sleep(5000);
        
        driver.navigate().to("file:///C:/Users/Sukhil%20Hariharan/Desktop/multiselectdropdown.html");
        Select lstbox = new Select(driver.findElement (By.id("tools")));
        lstbox.selectByVisibleText("Selenium IDE");
        System.out.println("Selected is - Selenium WebDriver");
        lstbox.selectByIndex(1);
        System.out.println("Selected is - Selenium IDE");
        Thread.sleep(3000);
        driver.quit();

	}

}
