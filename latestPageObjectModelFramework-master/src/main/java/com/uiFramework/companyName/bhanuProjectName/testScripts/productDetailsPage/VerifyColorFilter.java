package com.uiFramework.companyName.bhanuProjectName.testScripts.productDetailsPage;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.uiFramework.companyName.bhanuProjectName.helper.browserConfiguration.config.ObjectReader;
import com.uiFramework.companyName.bhanuProjectName.helper.logger.LoggerHelper;
import com.uiFramework.companyName.bhanuProjectName.pageObject.ApplicationText;
import com.uiFramework.companyName.bhanuProjectName.pageObject.NavigationMenu;
import com.uiFramework.companyName.bhanuProjectName.pageObject.ProductCategoryPage;
import com.uiFramework.companyName.bhanuProjectName.testbase.TestBase;


/**
 * @author Bhanu Pratap
 */
public class VerifyColorFilter extends TestBase{
	private final Logger log = LoggerHelper.getLogger(VerifyColorFilter.class);
	 @Test
	public void testVerifyColorFilter() throws InterruptedException{
		
		 getApplicationUrl(ObjectReader.reader.getUrl());
		 NavigationMenu nav = new  NavigationMenu(driver);
		 ProductCategoryPage pg =  nav.clickOnMenu(nav.womenMenu);
		 pg.selectColor(ApplicationText.Yellow);
		 Thread.sleep(7000L);
		 pg.verifyColor("#F1C40F", ApplicationText.Yellow);
		 
		 
		
	}

}
