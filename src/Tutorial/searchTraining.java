package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchTraining {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.simplilearn.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("header_srch")).sendKeys("selenium");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='homepage-search-form']/form/button/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='body_content']/div[1]/div[4]/div[2]/div[4]/div[2]/div/ul/li[2]/a/div[1]/h2")).click();
		
           System.out.println("The Page Tittle is"+driver.getTitle());

	}

}
