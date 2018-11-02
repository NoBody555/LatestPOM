import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class NewTab {

	/**
	 * @param args
	 * @throws Exception
	 */
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");
      ChromeOptions opt = new ChromeOptions();
         opt.addArguments("disable-infobars");
		WebDriver driver  = new ChromeDriver(opt);
       
         driver.get("https://www.google.com");
         String newTab = Keys.chord(Keys.CONTROL,"t");
        // driver.switchTo().window(newTab);
         
      WebElement ele = driver.findElement(By.linkText("Gmail"));
  new Actions(driver)
         .keyDown(Keys.CONTROL).click(ele).keyUp(Keys.CONTROL).build().perform();
        
   */
        //System.out.println(regression(5));
    // System.out.println(java.time.LocalTime.now());
		int arr[][]= { {3,4,5},
				      {4, 1,-22},
				      {8,-9,99}
				     };
		int col=0;
		int min =arr[0][0];
		int max=arr[0][0];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++)
				 if(arr[i][j]<min) {
					 min=arr[i][j]; col=j;
		       }
		}
		 max=arr[0][col];
		 
		  int k=0;
		  System.out.println();
		  while(k<3) {
			  if(arr[k][col]>max)
				  max=arr[k][col];
			  //System.out.println(arr[k][col]);
			  k++;
		  }
		System.out.println(min +" and max is : "+ max);
		 
	}
	public static int regression(int num) {
		if(num<=1)
			return 1;
		else
			return num*(regression(num-1));
	}

}
