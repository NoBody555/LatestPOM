import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class CrapMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   String ab="abcdefqhijkam";
	    char []abc= ab.toCharArray();
	    boolean isUnique=false;
        
	   int number =151,sum=0;
	   System.out.println(factorial(5));
	   Random rnd = new Random();
	   int i=1;
	   while(i<5) {
	  int result =    1000000+ rnd.nextInt(7000000);
	  System.out.println(result);
	     i++;
	   }
	   int ii=1;
	   while(ii<10) {
	   System.out.println(generateString());
	     ii++;
	   }
	   String a="cba"; String b="bca";
	   if(anagram(a,b))
		   System.out.println("anagram");
	   else
		   System.out.println("not anagram");
	   
	   String una="abkcdefqghijk";
	   for(char un:una.toCharArray()) {
		  if(una.indexOf(un)==una.lastIndexOf(un))
			   isUnique = true;
		  else {
			  isUnique =false;
			  break;
		  }
			  
	   }
	   if(isUnique)
		   System.out.println("string is unique");
	   else
		   System.out.println("string isn't unique");
	   permutation("abc");
	   reverseEachWords("Java the Concept of the Day");
	   System.out.println();
	   findDublicate("abackbacana");
	}
      public static int factorial(int num) {
    	  if(num<=1)
    		  return 1;
    	  else
    		  return num*(factorial(num-1));
      }
      public static String generateString() {
    	  String a ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    	 StringBuilder sb = new StringBuilder();
    	 Random rnd = new Random();
    	 while(sb.length()<11) {
    		 
    		 int index = (int)(rnd.nextFloat()*a.length());
    		  sb.append(a.charAt(index));
    	 }
    	  
    	  
              return sb.toString();    	
              
      }
      
      public static boolean anagram(String a, String b) {
    	  boolean ab=false;
    	   if(a.length()!= b.length())
    		   System.out.println("Strings are not equal");
    	   else {
    	    char aa[]=a.toCharArray();
    	    char bb[]=b.toCharArray();
    	    Arrays.sort(aa);
    	    Arrays.sort(bb);
    	    ab=  Arrays.equals(aa, bb);
    	  /* Arrays.sort(a.toCharArray());
    	   Arrays.sort(b.toCharArray());
    	ab=  Arrays.equals(a.toCharArray(), b.toCharArray());*/
    	 // System.out.println(ab);
    	   }
    	 return ab;
    	
      }
      public static void permutation(String a) {
    	  for(int i=0; i<a.length(); i++) {
    		  for(int j=0; j<a.length(); j++)
    			  System.out.println(a.charAt(i)+""+a.charAt(j));
    	  }
      }
    	 public static void reverseEachWords(String a) {
    		 
    	String aa[] = a.split(" ");
    	for(int i=0; i<aa.length; i++) {
    	     String word = aa[i];
    	      for(int j=word.length()-1; j>=0; j--)
    	    	  System.out.print(word.charAt(j));
    	      System.out.print(" ");
    	}
    		 
    	
    	 }
    	 public static void findDublicate(String a) {
    		ArrayList<Character> arr = new ArrayList<Character>();
    		 for(int i=0; i<a.length(); i++) {
    			 if(!arr.contains(a.charAt(i))) {
    				 arr.add(a.charAt(i));
    			 
	    			 int count=1;
	    			 for(int j=i+1; j<a.length(); j++)
	    			 {
	    				 if(a.charAt(i)==a.charAt(j))
	    					 count++;
	    			 
	    			 }
	    			 if(count>1)
	    			 System.out.println(a.charAt(i)+": "+count);
    		    }
    	     }
          }
      
}
