package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AautoSuggestiveDRPdwn {

	public static void main(String[] args) {
		 //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJEET PATEL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		   WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
		   
		   driver.get("https://www.makemytrip.com/");
		   WebElement source=driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[1]/label"));
		   source.click();
		   source.sendKeys(Keys.ARROW_DOWN);
		   source.sendKeys(Keys.ENTER);


	}

}
