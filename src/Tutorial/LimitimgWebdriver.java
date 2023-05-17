package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimitimgWebdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AJEET PATEL\\Downloads\\chromedriver.exe");
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
	   
	   

		
		
		
		
		

	}

}
