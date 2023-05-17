package Tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
	
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		
		driver.get("https://in.yahoo.com/?p=us");
		
		driver.navigate().back();
		
		driver.close();
		
		

	}

}
