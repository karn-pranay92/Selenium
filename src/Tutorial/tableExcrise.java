package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableExcrise {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJEET PATEL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
	       int rowcount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
	       
	      // System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size());
	       
	       int columncount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	       
	       
	       for(int i=0;i<columncount-2;i++)
	       {
	         String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
	         int valueinteger=  Integer.parseInt(value);
	         sum=sum+valueinteger;
	       }
	       System.out.println(sum);
	      String Extras = driver.findElement(By.xpath("//*[@id='innings_1']/div[1]/div[14]/div[1]/following-sibling::div")).getText();
	      int extrasValue=Integer.parseInt(Extras);
	      int TotalSumValue=sum+extrasValue;
	      System.out.println(TotalSumValue);

	      
	  String ActualTotal=driver.findElement(By.xpath("//*[@id='innings_1']/div[1]/div[15]/div[1]/following-sibling::div")).getText();
	  int ActualTotalVAlue=Integer.parseInt(ActualTotal);
	  if(ActualTotalVAlue==TotalSumValue)
	  {
	  System.out.println("Count Matches");
	  }
	  else
	  {
	  System.out.println("count fails");
	}

	}
}
