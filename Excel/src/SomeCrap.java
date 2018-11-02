import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SomeCrap {
	public static void main(String[] args) throws Exception {
	String rand="acdefghijklmnopqrstuvwxyza";
	boolean isUnique=true;
	char []r=  rand.toCharArray();
	   for(char ra:rand.toCharArray()) {
		   if(rand.indexOf(ra)!=rand.lastIndexOf(ra)){
                  isUnique=false;
                  break;
		   }
	   }
	       if(isUnique)
	    	   System.out.println("is uni");
	       else
	    	   System.out.println("is NOT uni");
		     /* Set<Character> keys = maps.keySet();
		       for(Character key:keys) {
		    	   if(maps.get(key)>1)
		    		   System.out.println(key+": "+maps.get(key));
		    	   
		       }*/
	       int number = 7896;
	         long re=0;
	         while(number>0) {
	        	  re= (re*10) +(number % 10);
	        	   number /=10;
	         }
	         System.out.println(re);
	         int numb = 12345;
	         int sum=0;
	         while(numb>0) {
	        	 sum += numb%10;
	        	 numb/=10;
	         }
	         System.out.println(sum);
	         
	        int []arr= {2,6,2,0,5,4,1};
	          int startIndex=0;
	          int lastIndex=arr.length-1;
	          int sumRight =0;
	          int sumLeft=0;
	          
	          while(true) {
	        	  
	        	  if(sumRight>sumLeft)
	        		  sumLeft += arr[lastIndex--];
	        	  else
	        		  sumRight += arr[startIndex++];
	        	  if(startIndex>lastIndex) {
	        		  if(sumRight==sumLeft)
	        			  break;
	        		  else
	        			  throw new Exception("not a valid array");
	        	  }
	          }
	              System.out.println(lastIndex);
	             
	       
	}
}
