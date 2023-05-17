package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");

	       WebDriver driver =new ChromeDriver();

	      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

	      driver.manage().window().maximize();

	      System.out.println(driver.getTitle());   

	   // OriginStation

	    driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

	    driver.findElement(By.cssSelector("a[value='DEL']")).click(); 

	    System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).getAttribute("value"));

	// Destination

	    driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();

	    driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();

	    System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).getAttribute("value"));

	     Thread.sleep(3000);
		
		

	}

}
