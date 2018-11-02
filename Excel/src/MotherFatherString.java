import java.util.ArrayList;

public class MotherFatherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		   String[] sr= {"rant","pant","ran","sant","can","dant","cant","do","dolt"};
		
		   String max= sr[0];
		   String loser="";
		  for(int i=0; i<sr.length; i++) {
			  if(i+1<sr.length && sr[i].length()<sr[i+1].length())
			  
				  max=sr[i+1];
			  
		  }
		   ArrayList <String> arr = new ArrayList<String>();
		  if(max.length()==sr[0].length()) {
		     for(int i=0; i<sr.length; i++) {
		    	 if(!arr.contains(sr[i])) {
		    		 arr.add(sr[i]);
		    	/*if(i+1<sr.length && sr[i].length() != sr[i+1].length()) {
		    		System.out.println(sr[i+1]);
		    		 i=i+1;
		    	}
		    	 else*/
		    		/*if(i+1<sr.length && (sr[i].length()==sr[i+1].length())) {
		    			
		    			
		    			System.out.println(sr[i+1]);
		    			
		    		}*/
		    		 int count=1;
		    	   for(int j=i+1; j<sr.length;j++) {
		    		  
		    		  
		    		   if(sr[i].length()==sr[j].length()) {
		    			   /*System.out.println(sr[j]);
		    			    if(j==sr.length-1)
		    			       i=sr.length-1;*/
		    			       count++;
		    			   
		    			   }
		    		   }
		    	       if(count>2) {
		    	    	   System.out.println(sr[i]+": "+count);
		    	    	   count=1;
		    	       }
		    	   }
		     }
		  }else
			  System.out.println(max);
		  for(String a:arr)
			  System.out.print(a+", ");
		   
		/*int number =4321;
		long r=0;
		while(number>0) {
		  r= (r *  10)+ (number%10);
		  number /=10;
		}*/
		//System.out.println(r);
	}

}
