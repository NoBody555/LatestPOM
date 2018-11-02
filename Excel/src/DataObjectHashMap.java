import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class DataObjectHashMap {

	@Test(dataProvider="getData")
	public static void readData(Map mapdata) {
		System.out.println(mapdata.get("userName"));
		System.out.println(mapdata.get("password"));
		//System.out.println(mapdata.get("ross"));
	}
   @DataProvider(name="getData")
   public Object[][] returningData() throws IOException{
	   
	    
	    File file = new File("C:\\Users\\ccomp\\eclipse-workspace\\latestPageObjectModelFramework-master\\Mapcrap1.xlsx");
	   FileInputStream fis = new FileInputStream(file);
	   XSSFWorkbook wb = new XSSFWorkbook(fis);
	   XSSFSheet sheet =    wb.getSheetAt(0);
	     int rowcount =sheet.getLastRowNum();
	     System.out.println(rowcount);
	     int colCount = sheet.getRow(0).getLastCellNum();
	     System.out.println("col: "+colCount);
	    		 
	   Object[][] obj = new Object[rowcount][1];
	   for(int i=0;i<rowcount; i++) {
		   Map<Object,Object> map = new HashMap<Object,Object>();
		   for(int j=0; j<colCount; j++) {
			   map.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i+1).getCell(j).toString());
			   System.out.println(sheet.getRow(0).getCell(j).toString()+", "+ sheet.getRow(i+1).getCell(j).toString());
		   }
		   //col and row
		   obj[i][0]=map;
		   System.out.println("I: "+i);
	   }
	   
	      return obj ;
	   
   }
   public static void main(String[] args) {
	for(int i=1; i<6;i++) {
		for(int j=1; j<=i; j++) 
			System.out.print("*");
		
		for(int k=1; k<i; k++)
			System.out.print("*");
		
		System.out.println();
	}
	for(int i=1; i<6;i++) {
		for(int j=1; j<=i; j++) 
			System.out.print(j);
		
		for(int k=1; k<i; k++)
			System.out.print(k);
		
		System.out.println();
		//*** *** ***
		//*** *** ***
	}
	
	
	/*1
	 * 121
	 * 12321
	 * 1234321
	 * 
	 * 
	 * */
	/*for(int i=1; i<7; i++) {
		for(int j=1; j<i; j++)
			System.out.print(j);
		for(int k=i; k>0; k--)
			System.out.print(k);
		  System.out.println();
	}*/

		/*	System.out.println();
			Scanner input = new Scanner(System.in);
			int num[]=new int[3];
			 for(int i=0; i<num.length; i++) 
			  num[i] = input.nextInt();
			  if(num[0]+num[1]==num[2])
			  System.out.println("matched");
			  else
				  System.out.println("Dont Matched!");*/
	              
			  /*Scanner f = new Scanner(System.in);
			  int no=   f.nextInt();
			  int arr[]=new int[no+1];
			   arr[0]=1;
			   arr[1]=1;
			   int sum=0;
			   for(int i=2; i<=no; i++)
				   arr[i]=arr[i-1]+arr[i-2];
			   System.out.println(arr[no]);
			   */
			  
			  
		
		/*String arre[]=	 {"cat",
		             "flag",
			  "green",
			  "country",
			  "w3resource"};*/
	//String arre[]= {"five5","five5","ho","dogg5","wo","karen","moth5","beau5","five5","dark5","woj","pojo","karen","five5","poj"};
	 String arre[]= {"w3resourcedfdfdfdfdfd","dog","firm","cat","pet","wet","dynamitcvdsdse","wo","ninjdfdfdfdfdferewererererererea"};
			
	        /*   int l=0;
	           String crown = arre[0];
			   for(int i=0; i<arre.length; i++) {
				   
				   for(int j=i+1;j<arre.length; j++) {
					   if(arre[i].length()<arre[j].length()) {
						    arre[i]=arre[j];
					         crown = arre[j];  
					   }
					 
			      }
				// System.out.println(crown);
				    for(int k=i+1; k<arre.length; k++)
				       {
					     if(!crown.equalsIgnoreCase(arre[k]) && crown.length() == arre[k].length())
						    {
					    
					    	
						     	System.out.println(crown);
						    	//System.out.println(arre[k]);
						    	   crown=arre[k];
						    	     i=k;
						    	     l=k;
					         
					         }		
					  
				          
				       }
				          if(i==arre.length-1)
				        	  System.out.println(arre[l]);
			           }*/
			   //System.out.println("true: "+arre[l]);
			 //  System.out.println(crown);
      
	//arre[]= {"five5","ho","dogg5","wo","moth5","beau5","dark5","woj","pojo","karen","five5","poji"};
	 
	      Map <String,Integer> maps = new TreeMap<String,Integer>();
           String crap="";
           String ron="";
            ArrayList<String> arr = new ArrayList<String>();
            ArrayList<String>aded = new ArrayList<String>();
            int k=0;
          String max=arre[0];
          //int count=1;
            for(int i=0, count=1; i<arre.length; i++) {
            
            	String mon="";
            	  if(!arr.contains(arre[i])) {
            		   arr.add(arre[i]);
            		   for(int j=i+1; j<arre.length; j++) {
            			   if(max.length()<arre[j].length())
            			         max=arre[j];
            		   }
            		   for(int c=i+1; c<arre.length; c++) {
            			   if(max.length()==arre[c].length()&& !max.equals(arre[c])) {
            				   System.out.println(max);
            				     max=arre[c];
            				     i=c;
            				     break;
            			   }
            			   
            		   }
            		  
            	   }else  if(arr.contains(arre[i])) {
            			   
            			 
            			    for(int s=0; s<arre.length;s++) {
            			      if(!aded.contains(arre[s])) {
            			    	 aded.add(arre[s]);
            			    	count=1;
            			    	for(int j=s+1;j<arre.length; j++) {
            			    		
            			    		if(arre[s].equalsIgnoreCase(arre[j])) {
            			    			 count++;
            			    		     continue;
            			    		  }
            			    	 }
            			    		  if(count>=2) 
            			    		     System.out.println(arre[s]+" is repeated "+ count);
            			    				 
            			    	      count=1 ;  
            			    	 	  
            			          }
            			     
            			     }
            		   
            		      }
            	        
            	     }
            	
            	    System.out.println(max);
            }
            	
       }

