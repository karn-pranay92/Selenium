package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffE2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rediff.com");
      driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
      driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
      driver.findElement(By.id("password")).sendKeys("123");
      driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]")).click();
      
      //driver.close();
	}

}
