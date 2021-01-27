package WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_WebTable {
	public static void main (String args[]) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("file:///C:/Users/Sukhil%20Hariharan/Desktop/WebTable.html");
        //Count
        int row = driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[1]/td")).size();
        int row_col = driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td")).size();
        System.out.println(row);
        System.out.println(col);
        System.out.println(row_col);
        //Data
        String cell = driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[2]/td[2]")).getText();
        System.out.println(cell);
        for(int i = 1; i<=row; i++)
        {
        	String data = driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr["+i+"]")).getText();
        	System.out.println(data);
        }
        driver.close();
        
	}

}
