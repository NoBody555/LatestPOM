import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.util.SystemOutLogger;

import bsh.org.objectweb.asm.Type;

public class RandomCrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = {"jumbo","lambo","wo","flow","doe","cr","crow","brush","bk","frc","love","dove","com"};
//String [] arr={"jambo","credentials","lambo","fambo","dw","credentials","cri","db","ris","sup","credentials","diamond","credentials"};
   String m=arr[0]; 
   ArrayList<String> a=new ArrayList<String>();
       /* for(int i=1; i<arr.length; i++){
           
            	if(m.length()<arr[i].length())
            		   m=arr[i];
        }
            for(int i=0; i<arr.length; i++) {
            	int count=1;
            		if(m.length()==arr[i].length() && !(m.equalsIgnoreCase(arr[i])))
            			 System.out.println(arr[i]);
            		else
            			if(m.equalsIgnoreCase(arr[i])) {
            				if(!a.contains(m)) {
            					a.add(arr[i]);
            					
            				  for(int j=i+1; j<arr.length; j++) {
            					  if(arr[i].equalsIgnoreCase(arr[j]))
            						   count++;
            				  }
            				  if(count>1)
                      			  System.out.println(arr[i]+" count is: "+count);
                			
                      		        // count=1;
            				}
            			}
            		if(i==arr.length-1)
            			System.out.println(m);
            				
            			
             }
               String crap ="abdddffaaakkdlf";
              
               List str = new ArrayList<>();
               for(int i=0; i<crap.length(); i++) {
            	   int count=1;
            	   for(int j=i+1; j<crap.length(); j++) {
            		   
            		   if(crap.charAt(i)==crap.charAt(j)) {
            			   count++;
            			   i=j;
            		   }
            		    else 
          	    	        break;
            		   
            	       }
            	       
            	    
            	       str.add(crap.charAt(i));
            	         if(count>1) {
            	        	Integer cunt =Integer.valueOf(count);
            			   str.add(cunt);
            			     count=cunt;
            	      
            	         }
            	   }
               int sum=5;
                 
            	   ArrayList<String> op = new ArrayList<String>();
            	   op.add(Integer.toString(sum));
            	      System.out.println(sum);
            	        String jh ="crap";
            	        if(jh.getClass()==String.class)
            	        	System.out.println(jh);
            	       Integer k=    Integer.valueOf(sum);
            	       if(k.getClass()==Integer.class)
            	    	   System.out.println("im an Integer");
            	        for(Object s:str)
            	           System.out.print(s.toString());
            	    Object[] myar = str.toArray();
            	    System.out.println();
            	      for(Object my:myar) {
            	    	  if(my.getClass()==Integer.class)
            	    		  System.out.print(my+", ");
            	      }*/
            	   
               
        //System.out.println(m);
   
                       
                        	
                        String dub="stringrightwrongbaby";
                        int len=0;
                          Map<Character,Integer> maps = new TreeMap<Character,Integer>();
                              for(char d:dub.toCharArray()) {
                            	  
                            	  if(!maps.containsKey(d))
                            		  maps.put(d,1);
                            	  else
                            	  {
                            		// System.out.println (maps.toString());
                            		 len=Math.max(len, maps.size());
                            		// System.out.println(maps.size());
                            		     maps.clear();
                            	  }
                              }
                         /* Set<Character> keys = maps.keySet();
                          for(Character key:keys) {
                        	  if(maps.get(key)>1)
                        		  System.out.print(key+" : "+ maps.get(key));
                        	     System.out.println();
                          }*/
                             // System.out.println(len);
                              
                              /*int ar[] = {2,6,2,1,0,6,3,1,1};
                              int startIndex=0;
                              int lastIndex =ar.length-1;
                               int sumRight =0;
                               int sumLeft=0;
                               while(true) {
                            	   
                            	   if(sumRight>sumLeft)
                            		   sumLeft+=ar[lastIndex--];
                            	   else
                            		   sumRight+=ar[startIndex++];
                            	   if(startIndex>lastIndex) {
                            		   if(sumRight==sumLeft)
                            			   break;
                            	   }
                               }
                               System.out.println("lastIndex: "+lastIndex);
                               System.out.println("startIndex: "+startIndex);*/
                                           //0 1 2 3
                              int ar[][]= {{2,5,8,6},
                            		       {99,6,3,4},
                            		       {-5,19,14,7},
                            		       {118,3,2,1}
                            		        };
                              System.out.println(ar[3][3]);
                              
                             int mn = ar[0][0];
                             int col=0;
                             int max=0; 
                             for(int i=0; i<ar.length; i++) {
                            	 
                            	 for(int j=0; j<ar[i].length; j++) {
                            		 
                            		  if(ar[i][j]<mn) {
                            			  mn=ar[i][j];
                            			  col=j;
                            		  }
                            		  
                            	 }
                            	 
                            	 max=ar[0][col];
                            	  int k=0;
                            	  while(k<ar[col].length) {
                            		  if(ar[k][col]>max) 
                            		   
                            			 max=ar[k][col];
                            		  
                            		       k++;
                            		  
                            	  }
                            	 if(i==ar.length-1) {
                            		 System.out.println(mn);
                            		 System.out.println(ar[i].length);
                            	 }
                             }
                               System.out.println(max +" value in the coloum: "+col);   
                               System.out.println(arr[col].length());
                               System.out.println("array Length: "+ar.length);
                              
                               
	                 }        
         
               }
