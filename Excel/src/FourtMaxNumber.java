
public class FourtMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 
	     int arr[]={999,888,67,3343,469,11,5,455,1112};
	     System.out.println();
	      int max=arr[0];
	      int secondMax=0,thirdMax=0,fourthMax=0;
	     for(int i=0; i<arr.length; i++){
	    	 
	     for(int j=1; j<arr.length; j++) {
	         if(max<arr[j]){
	             secondMax=max;
	             max=arr[j];
	         }
	         else if(max != arr[j]  && secondMax<arr[j]){
		          
		            thirdMax=secondMax;
		             secondMax=arr[j];
		        }
	         else if(secondMax != arr[j] && thirdMax<arr[j]&& max!=arr[j]){
	               fourthMax=thirdMax;
	               thirdMax=arr[j];
	        }
	         
	     
	        
	       
	        else
	            if(fourthMax<arr[j] && thirdMax != arr[j] && max != arr[j] && secondMax !=arr[j])
	                fourthMax=arr[j];
	     }
	     }
	     System.out.print(max+","+secondMax+","+thirdMax+", "+fourthMax);
	}

}
