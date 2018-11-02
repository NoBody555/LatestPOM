import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int number =83931;
            long invert =0;
            while(number>0) {
            	invert = (invert * 10) + (number %10);
            	number /= 10;
            }
            System.out.println(invert);
            
            
            String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
    				"aug", "Sep", "Oct", "nov", "Dec" };
            System.out.println("befoer sorting the array");
                 printingArray(inputList);
            System.out.println("After sorting the array");
                  Arrays.sort(inputList,String.CASE_INSENSITIVE_ORDER);
                  for(String input:inputList)
                	  System.out.print(input+", ");
                  System.out.println("\n case sensitive array");
                  int[]arr= {5,8,-50,3,2,-69,43,99,222};
                //filterDubplicate(arr);
                System.out.println();
             String str = "cameron high land";
          str=   str.replaceAll("\\s", "%");
                 System.out.println(str);
                 String input = "Try    to    remove   extra   spaces.";
               input =    input.trim();
               System.out.println(input);
               StringTokenizer substr = new StringTokenizer(input, " ");
               StringBuffer sb = new StringBuffer();
               while(substr.hasMoreElements()) {
            	   sb.append(substr.nextElement()).append(" ");
               }
               System.out.println(sb.toString().trim());
               findTwoMaxNumbers(arr);
                 swapTwoNumbers(5, 10);
                 
	}
	public static void printingArray(String[] arr) {
		   
		for(String a:arr)
			System.out.print(a+", ");
	}
	public static void filterDubplicate(int[] arr) {
		ArrayList<Integer> add = new ArrayList<Integer>();
		System.out.println("passed array");
		for(int a:arr)
			System.out.print(a+", ");
		System.out.println("\n after removing dubplicate from an PASSED ARRAY");
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j])
				    arr[j]=0;
			}
			//System.out.print(arr[i]+", ");
			if(!add.contains(arr[i])&& arr[i] !=0)
				add.add(arr[i]);
		}
		
			
			
		
		 // return arr;
	
	for(Integer a:add)
		System.out.print(a+" ");
	}
	 public static void findTwoMaxNumbers(int[] arr) {
		   int max=arr[0];
		   int secondMax=arr[0];
		      for(int i=0; i<arr.length; i++) {
		    	  if(max<arr[i]) {
		    		  secondMax=max;
		    		  max=arr[i];
		    		  
		    	  }
		    	  else 
		    		  if(secondMax<arr[i])
		    			secondMax=arr[i];
		    	 
		      }
		      System.out.println(max+" \n secondMax "+secondMax);
		      
	 }
	 
	 public static void swapTwoNumbers(int x, int y) {
		 System.out.println("x: "+x+"y: "+y);
		   x=x+y;
		   y=x-y;
		   x=x-y;
		   System.out.println("x: "+x+" y: "+y);
	 }
    }

