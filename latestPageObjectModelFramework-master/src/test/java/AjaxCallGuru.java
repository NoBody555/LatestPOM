import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class AjaxCallGuru {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  String url ="http://demo.guru99.com/test/ajax.html";
  ChromeOptions options = new ChromeOptions();
	options.addArguments("disable-infobars");
	DesiredCapabilities chrom = DesiredCapabilities.chrome();
	chrom.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	
	
	System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
      WebDriver driver = new ChromeDriver(options);
      driver.manage().window().maximize();
      driver.get(url);
   List<WebElement> elements = driver.findElements(By.xpath("//input[@type=\"radio\"]"));
	              for(WebElement ele:elements) {
	            	  ele.click();
	            	  driver.findElement(By.id("buttoncheck")).click();
	            	  Thread.sleep(3000);
	            	  System.out.println(driver.findElement(By.cssSelector("p[class='radiobutton']")).getText());
	            	  Thread.sleep(10000);
	            	  
	              }
	}

}
