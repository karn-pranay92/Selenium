package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SIXAssingment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AJEET PATEL\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  
		  
		  driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		  String opt= driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).getText();
		  
		  Thread.sleep(2000);
		  
		  WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));

	        Select s=new Select(dropdown);

	        s.selectByVisibleText(opt);
	         driver.findElement(By.className("enter-name")).sendKeys(opt);
	         driver.findElement(By.id("alertbtn")).click();
	         
	         String text=driver.switchTo().alert().getText();
	         if(text.contains(opt))

		     {

		    System.out.println("Alert message success");

		     }

		     else

		    System.out.println("Something wrong with execution");

	}

}
