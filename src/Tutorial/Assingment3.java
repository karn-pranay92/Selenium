package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assingment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");

        Select Adults = new Select(driver.findElement(By.id("Adults"))); // Select static dropdown value

        Adults.selectByValue("3");

        Select Child = new Select(driver.findElement(By.id("Childrens")));

        Child.selectByValue("2");

        driver.findElement(By.id("DepartDate")).click();

        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click(); //selecting current date

        driver.findElement(By.id("MoreOptionsLink")).click();

        Select PassClass = new Select(driver.findElement(By.id("Class")));

        PassClass.selectByValue("First");

        driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Spicejet");

        driver.findElement(By.id("SearchBtn")).click();

     //   System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

        driver.close();

	}

}
