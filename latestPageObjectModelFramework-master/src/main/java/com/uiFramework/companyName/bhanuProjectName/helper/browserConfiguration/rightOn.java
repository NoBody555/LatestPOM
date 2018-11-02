package com.uiFramework.companyName.bhanuProjectName.helper.browserConfiguration;


enum Mobile{
	
	Chrome,Firefox
}

public class rightOn{

/*	@BeforeTest
	public void browserTeset() {
		
		
		
	}*/
public static void main(String[] args) {
	

	 Mobile ret;
     ret = Mobile.valueOf("Chrome"); 
     System.out.println("Selected : " + ret);
      }
}