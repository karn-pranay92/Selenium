package Tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class CalenderHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJEET PATEL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='travel_date']")).click();
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='datepicker-switch']")).getText().contains("November"));
	{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
	}
		
          List<WebElement>dates=driver.findElements(By.className("day"));
        int count=driver.findElements(By.className("day")).size();
          for(int i=0;i<count;i++)
           {
       	   String text=driver.findElements(By.className("day")).get(i).getText();
        	   if(text.equalsIgnoreCase("23"))
        	   {
       		   driver.findElements(By.className("day")).get(i).click();
       		   break;
       	   }
       	   
           }
	}

}
