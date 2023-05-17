package Tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumHeadlessTesting {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new HtmlUnitDriver();
		
		driver.get("https://www.bbc.com/");
		
	}

	
}
