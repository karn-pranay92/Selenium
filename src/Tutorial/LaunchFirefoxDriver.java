package Tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");

	}

}
