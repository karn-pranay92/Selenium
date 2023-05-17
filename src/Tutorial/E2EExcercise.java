package Tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E2EExcercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	   	WebDriverManager.chromedriver().setup();
		 // System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  driver.manage().window().maximize();
		  // Auto suggestive dropdown
		  
		  driver.findElement(By.id("autosuggest")).sendKeys("ind");
		  Thread.sleep(3000);
		  List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		  
		  for(WebElement option:options)
		  {
			  
			  if(option.getText().equalsIgnoreCase("India"))
			  {
			  option.click();
			  
			  break;
			  }
		  }
		  
		  //Dynamic DropDown
		  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		  driver.findElement(By.cssSelector("a[value='IXB']")).click();
		  System.out.println( driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getAttribute("Value"));
		  
		  driver.findElement(By.xpath("(//a[@value='KNU']) [2] ")).click();
		System.out.println(driver.findElement(By.xpath("(//a[@value='KNU']) [2] ")).getAttribute("value"));
		
		// calender
		
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[2]/td[4]/a")).click();
		
		//checkBox and size
		
		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type=checkbox]")).size());
		
	//	Passenger Dropdown
		
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(3000);
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
          driver.findElement(By.id("btnclosepaxoption")).click();
      	  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
