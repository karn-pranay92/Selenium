package Tutorial;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReadCaptcha {

	
		
		public static void main(String[] args) throws IOException, TesseractException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			
		
				driver.manage().window().maximize();
				driver.get("https://www.esic.in/ESICInsurance1/ESICInsurancePortal/PortalLogin.aspx");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.id("lnkemployer")).click();
				
				Thread.sleep(2000);
				WebElement img=driver.findElement(By.xpath("//*[@id=\"img1\"]"));
				File src=img.getScreenshotAs(OutputType.FILE);
				
				String path="C:\\Users\\User\\workspace\\Captcha\\screenshot\\image.png";
				FileHandler.copy(src, new File(path));
				
				Thread.sleep(2000);
				
				ITesseract image=new Tesseract();
				//image.setTessVariable("user_defined_dpi", "400");

				String imageText=image.doOCR(new File(path));
				//String finaltext=imageText.replaceAll("[^a-zA-X0-9]", "");
				//System.out.println("image ocr done");
				System.out.println(imageText);
				Thread.sleep(1000);
				//driver.close();
				
				
				/*int index=imageText.indexOf(" ");
				System.out.println(index);
				String captcha_details=imageText.substring(index+1);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.xpath(".//input[@id='txtChallanCaptcha']")).sendKeys(captcha_details);
			*/
			
		}

	}
