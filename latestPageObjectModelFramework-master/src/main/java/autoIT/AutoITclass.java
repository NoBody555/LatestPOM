package autoIT;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class AutoITclass {
   WebDriver driver;
	  @BeforeTest
	  public void settingUpAuto() throws IOException {
		  System.setProperty("webdriver.chrome.driver", "C://Chromedriver.exe");
		  
		  ChromeOptions option = new ChromeOptions();
		//DesiredCapabilities caps=DesiredCapabilities.chrome();
		 // DesiredCapabilities cap = DesiredCapabilities.chrome();
		 // cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		  //cap.setCapability(ChromeOptions.CAPABILITY, option);
		  
 	       option.addArguments("disable-infobars");
		  
		  
		//String url =  "https://www.ukhairdressers.com/style/face-shape.asp";
		//  String url="https://www.engprod-charter.net/api/pub/cnetloginedge/spectrum-redir?targetUrl=https%3A%2F%2Fwww.engprod-spectrum.net%2F%3Fdomain-redirect%3Dtrue";
		 driver= new ChromeDriver(option);
		 //Runtime.getRuntime().exec("C:\\Users\\ccomp\\Documents\\auth.exe");
		 
		  
	  }
	  
	  //@Test(enabled=false)
	 public void autoItExectution() throws IOException {
		  
		  driver.findElement(By.cssSelector("input[type='file']")).click();
		  Runtime.getRuntime().exec("C:\\Users\\ccomp\\Documents\\scripttoUploadFile.exe");
		 // Runtime.getRuntime().exec("C:\\Users\\ccomp\\Documents\\AUTHENTICATION.exe");
		  		
		 
		  
	       }
	  @Test
	  public void authentication() throws IOException {
		 /* String URL = "http://ramdfeed:dfljdlfjdl@ www.softwaretestingmaterial.com";
		  driver.get(URL);*/
		 // driver.switchTo().alert();
		  Runtime.getRuntime().exec("C:\\Users\\ccomp\\Documents\\auth.exe");
		  
		  String url="https://www.engprod-charter.net/api/pub/cnetloginedge/spectrum-redir?targetUrl=https%3A%2F%2Fwww.engprod-spectrum.net%2F%3Fdomain-redirect%3Dtrue";
		  driver.get(url);
		  
		
		  Wait<WebDriver> wb = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(2))
				  .ignoring(NoSuchElementException.class);
		     
		  
		 System.out.println("done");
		//driver.switchTo().alert().accept();
		// driver.switchTo().alert();
		 
		 
	  }
	  }
