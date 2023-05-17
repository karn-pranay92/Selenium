package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment8 {

	public static void main(String[] args) throws InterruptedException {
       
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJEET PATEL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 
		 WebElement auto=driver.findElement(By.id("autocomplete"));
		 auto.sendKeys("ind");
		  Thread.sleep(2000);
		 driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		 driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		 driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 

	}

}
