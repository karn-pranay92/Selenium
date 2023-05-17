package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		//driver.findElement(By.xpath("/html/body")).click();
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		
		Actions act= new Actions(driver);
		WebElement src=driver.findElement(By.xpath("//*[@id='treeSource']/ul/li[1]/ul/li[1]/ul/li/div/span']"));
		WebElement target=driver.findElement(By.xpath("//*[@id='treeTarget']/ul/li[2]"));
		//act.clickAndHold(src).
		
		//moveToElement(target).
		
		//release(null)
		//.build().perform();
		act.dragAndDrop(src, target).perform();

	}

}
