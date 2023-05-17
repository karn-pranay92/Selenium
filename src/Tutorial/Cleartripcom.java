package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cleartripcom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	
      
        //adults
        WebElement adult=driver.findElement(By.id("Adults"));
        Select s=new Select(adult);
        s.selectByValue("2");
        //child
	      WebElement child=driver.findElement(By.id("Childrens"));
	      Select s1=new Select(child);
	      s1.selectByValue("3");
	      //Infants
	      WebElement inf=driver.findElement(By.id("Infants"));
	      Select s2=new Select(inf);
	      s2.selectByValue("2");
	      
	  	//calender
			driver.findElement(By.id("DepartDate")).click();
	      
	      driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
	      
	      driver.findElement(By.xpath("//*[@id='MoreOptionsLink']/strong")).click();
	      driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
	      //click search button
	      driver.findElement(By.id("SearchBtn")).click();
	      //error sms
	      System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());


	      

	}

}
