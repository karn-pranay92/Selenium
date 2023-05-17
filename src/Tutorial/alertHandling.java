package Tutorial;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJEET PATEL\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("cusid")).sendKeys("23456");
		
		driver.findElement(By.name("submit")).click();
		Alert alert = driver.switchTo().alert();
		String alertMessage=driver.switchTo().alert().getText();
		System.out.println("alertmessge");
		Thread.sleep(3000);
		alert.accept();
		
		

	}

	
	
}
