package Tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJEET PATEL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 WebElement table=driver.findElement(By.id("product"));
		 List<WebElement>Row=table.findElements(By.xpath("//*[@id='product']/tbody/tr"));
		 System.out.println(table.findElements(By.xpath("//*[@id='product']/tbody/tr")).size());
		 
		 
		List<WebElement> col=driver.findElements(By.xpath("//*[@id='product']/tbody/tr[2]/td"));
		System.out.println(driver.findElements(By.xpath("//*[@id='product']/tbody/tr[2]/td")).size());
		
		List<WebElement>secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		
		System.out.println(secondrow.get(0).getText());



		System.out.println(secondrow.get(1).getText());


		System.out.println(secondrow.get(2).getText());

	}

}
