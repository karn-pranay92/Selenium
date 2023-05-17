package Tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssingmentCheckbox1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement radio1=driver.findElement(By.cssSelector("input[value='radio1']"));
		WebElement radio2=driver.findElement(By.cssSelector("input[value='radio2']"));
		
		//Selecting the Radio Button
		
		radio1.click();
		System.out.println("radio button 1 is seleted");
		
		//Auto suggetion dropdown
		
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(3000);
	//	List<WebElement>options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
		List <WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option: options)
		{
			
			
			if(option.getText().equalsIgnoreCase("India"));
			option.click();
			break;
		}
		
		//selecting Checkbox
		 Select s=  new Select(driver.findElement(By.cssSelector("select[id=dropdown-class-example]")));
		 s.selectByVisibleText("Option1");
		
		 driver.findElement(By.id("checkBoxOption1")).click();
		 System.out.println( driver.findElement(By.id("checkBoxOption1")).isSelected());
		 System.out.println( driver.findElements(By.cssSelector("input[type='checkbox'] ")).size());
		 
		 //Uncheck the checkbox
		 Select s1=  new Select(driver.findElement(By.cssSelector("select[id=dropdown-class-example]")));
		 s1.selectByVisibleText("Option1");
		
		 driver.findElement(By.id("checkBoxOption1")).click();
		 System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); 
		 
		 
		 
		 
	}

}
