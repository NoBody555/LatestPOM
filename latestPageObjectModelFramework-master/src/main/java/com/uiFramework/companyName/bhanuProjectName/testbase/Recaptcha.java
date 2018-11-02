package com.uiFramework.companyName.bhanuProjectName.testbase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recaptcha {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C//Chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.google.com/recaptcha/api2/demo");
	List<WebElement> eles = driver.findElements(By.tagName("iframe"));
	   System.out.println(eles.size());
	} 
	    
	/*public void switchFrame(WebDriver driver,By by) {
	     
	}*/

}
