package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selsforce {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("ppiyush25@yahoo.com");
		driver.findElement(By.name("pw")).sendKeys("rachhu@123");
		//driver.findElement(By.className("button r4 wide primary")).click();//error compund class is not accept by selenium webdriver
         driver.findElement(By.xpath("//*[@id='Login']")).click();
		// TODO Auto-generated method stub

	}

}
