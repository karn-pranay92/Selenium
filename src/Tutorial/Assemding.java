package Tutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assemding {

	private static final String Assetr = null;

	public static void main(String[] args) {
		
	   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
	   Select toos=new Select(driver.findElement(By.id("tools")));
	   List actualList=new ArrayList();
	   
	   List<WebElement>myTools=toos.getOptions();
	   for(WebElement ele:myTools)
	   {
		   String data=ele.getText();
		   actualList.add(data);
	   }
	   List temp=new ArrayList();
	   temp.addAll(actualList);
	   //assending
	   Collections.sort(temp);
	// Assert.assertTrue(actualList.equals(temp));
	   
       
	}

}
