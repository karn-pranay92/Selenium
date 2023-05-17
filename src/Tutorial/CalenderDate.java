package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");

		 WebDriver     driver =new ChromeDriver();

		      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		      driver.manage().window().maximize();

		      System.out.println(driver.getTitle());  
		      driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//a[@value='BHO']")).click();
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("(//a[@value='ATQ'])[2]")).click();
		      System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).getAttribute("value"));
		      

		      
		   




	}

}
