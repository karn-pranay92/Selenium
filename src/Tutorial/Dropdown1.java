package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown1 {

	public static void main(String[] args) {
		
		   WebDriverManager.chromedriver().setup();
		  
		   WebDriver driver=new ChromeDriver();
		   
		   driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		   
		   driver.findElement(By.xpath("")).sendKeys("");
		   
	 
		   Select drpCountry = new Select(driver.findElement(By.xpath("//*[@id='post-2646']/div[2]/div/div/div/p/select")));
			 drpCountry.selectByVisibleText("Antarctica");

	}

}
