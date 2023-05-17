package Tutorial;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksopenSepreatPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AJEET PATEL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//count total links present on the webpage
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//count link present on the footer section 
		WebElement footerdriver =driver.findElement(By.id("gf-BIG"));
		
		//Limitin webdriver
	    System.out.println(footerdriver.findElements(By.tagName("a")).size());
	    
	    WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	    System.out.println(columndriver.findElements(By.tagName("a")).size());
	    
	  //4- click on each link in the coloumn and check if the pages are opening-
	    for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
	    {
	    	String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	
	    	columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
	    	
	    	
	    	
	    	
	    	
	    	Thread.sleep(5000);
	    	
	    	
	    }
	    
	   //open all tabs and printing title
	    Set<String>abc=driver.getWindowHandles();
	    Iterator<String>it=abc.iterator();
       
	    while(it.hasNext())
	    {
	    	driver.switchTo().window(it.next());
	    	System.out.println(driver.getTitle());
	    }
	}

}
