package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class te {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td[2]/div/input")).sendKeys("automation");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[11]/td/div/div/span[1]/span/input")).click();
	}
	//WebDriver driver=new FirefoxDriver();
	
}
