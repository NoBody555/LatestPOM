
import java.util.Scanner;
public class Nope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 5 numbers in ascenorder order for example 1 2 3");
            Scanner san = new Scanner(System.in);
		int num=  san.nextInt();
		int arr[]= new int[num];
		System.out.println("now enters the "+num+" numbers");
		    
    	     System.out.println(arr.length);
    
    	     for(int i=0; i<arr.length; i++) 
		        	
    	    	   arr[i]=san.nextInt();
        	    
		        	
		        for(int i=0; i<arr.length; i++) {
		        	if(i+1<arr.length && arr[i]>arr[i+1]) {
		        		System.out.println(arr[i]+ " is bigger than the "+arr[i+1]+" numbers must be in ascending order");
		        		return;
		        	}
		        }
		       
		        for(int a:arr)
		        	System.out.print(a+" ");
		        
	}

}
