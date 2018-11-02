package com.uiFramework.companyName.bhanuProjectName.testbase;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DyanmicCalendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C://chromderiver.exe");
        ChromeOptions options  = new ChromeOptions();
        options.addArguments("disable-infobar");
        
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://online.actitime.com/dfdfdfdf/login.do");
        driver.findElement(By.id("username")).sendKeys("heyemailmeback");
        driver.findElement(By.name("pwd")).sendKeys("whocares007");
        driver.findElement(By.id("")).click();
         Wait <WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMillis(30)).pollingEvery(Duration.ofMillis(5))
        		 .ignoring(NoSuchElementException.class);
         WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'New')"));
         wait.until(ExpectedConditions.visibilityOf(ele));
            ele.click();
            WebElement el=driver.findElement(By.xpath("//td[@class='x-date-middle']/descendant::button"));
          wait.until(ExpectedConditions.visibilityOf(el));
           driver.findElement(By.xpath("//table[@class='createTasksTable hideAddToTT']/tbody/tr[2]/td[4]/div/table/descendant::button")).click();
       WebElement month=driver.findElement(By.xpath("(//td[@class='x-date-middle']/descendant::button)[2]"));
       wait.until(ExpectedConditions.visibilityOf(month));
         month.click();
        driver.findElement(By.xpath("//a[contains(text(),'Mar')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(text(),'2017')]")).click();
        driver.findElement(By.xpath("(//button[contains(text(),'OK')])[2]")).click();
	}

}
