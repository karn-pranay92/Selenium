package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MYName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AJEET PATEL\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  driver.get("http://qaclickacademy.com/practice.php");
		  
		  driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		  String opt= driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).getText();
		  
		  WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));

	        Select s=new Select(dropdown);

	        s.selectByVisibleText(opt);

	}

}