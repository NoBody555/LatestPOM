
public class IntegerSum {

	
	

	     public static void main(String []args){
	    	/* 
	    	int num=5993,sum=0;
	         String nm=   Integer.toString(num);
	         for(int i=0; i<4; i++) {
	        sum+=	   Integer.parseInt(Character.toString(nm.charAt(i)));
	        	 
	         }
	         System.out.println(sum);
	         int s=0;
	         for(int i=num; i>0; i--) {
	        	 s+= num % 10;
	        	 num = num/10;
	         }*/
	        // System.out.println(s);
	         int num =371;
	         boolean isPrime=true;
	         int sum=0;
	         int temp=num;
	       	for(int i=num; i>0; i++) {
	             int r = num%10;
	              num = num/10;
	              sum += r*r*r;
	         }
	         if(temp==sum)
	        	 System.out.println("isPer");
	         else
	        	 System.out.println("isNotperfect");
	     
	     
	     String a="racecar";
	     String b ="";
	     for(int i=a.length()-1; i>=0; i--) 
	    	 b+=a.charAt(i);
	       
	     
	      if(b.equals(a))
	    	  System.out.println("palindrom");
	      else {
	    	String bb[]=  b.split("");
	    	 for(int i=0; i<bb.length; i++) {
	    	  
	    		System.out.print(bb[i]);
	    	      if(i==bb.length-1) {
	    	    	  System.out.println();
	    		  System.out.println("isNot Palidrome");
	    	      }
	    	}
	      }
	     }
}
