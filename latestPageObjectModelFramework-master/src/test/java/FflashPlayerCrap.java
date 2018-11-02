import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import Flash.FlashObjectWebDriver;

public class FflashPlayerCrap {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		DesiredCapabilities chrom = DesiredCapabilities.chrome();
		chrom.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
            WebDriver driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            String url="http://demo.guru99.com/test/flash-testing.html";
            driver.get(url);
            Thread.sleep(5000L);
            FlashObjectWebDriver flash = new FlashObjectWebDriver(driver, "myFlashMovie");
            flash.callFlashObject("Play");
            Thread.sleep(4000L);
            flash.callFlashObject("StopPlay");
            Thread.sleep(5000);
            
      flash.callFlashObject("SetVar","/:message", "Flash testing using Selenium WebDriver");
      System.out.println(flash.callFlashObject("GetVar", "/:message"));
	}

}
