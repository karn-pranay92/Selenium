package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class spicejet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/svg/g/circle[1]")).click();
		
		Select select=new Select(driver.findElement(By.xpath("//div[@class='r-1862ga2 r-1loqt21 r-1i10wst r-tceitz r-u8s1d css-76zvg2']")));
		
		select.selectByVisibleText("Agartala");
		
		

	}

}
