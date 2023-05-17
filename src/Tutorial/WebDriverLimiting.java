package Tutorial;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverLimiting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJEET PATEL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver= new ChromeDriver();
		 driver.get("http://qaclickacademy.com/practice.php");
		 
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		 
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		 WebElement columndriver=driver.findElement(By.xpath("//table/tbody/tr/td[2]/ul"));
		 System.out.println(columndriver.findElements(By.tagName("a")).size());
		 for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		 {
			 String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			 columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			 Thread.sleep(5000);
		 }
		 Set<String>abc=driver.getWindowHandles();
		 Iterator<String>it=abc.iterator();
		 
		 while(it.hasNext()){
			 driver.switchTo().window(it.next());
			 System.out.println(driver.getTitle());
			 
		 }
		 
		
	}

}
