package autoIT;

import java.util.Map;
import java.util.TreeMap;

public class MyThread implements Runnable{

	public void run() {
		System.out.println("The thread is running");
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
          MyThread my = new MyThread();
          Thread t1  = new Thread(my);
          t1.start();
          Thread t2  = new Thread(my);
          t2.start();
          System.out.println(isStringUnique("abcefghi"));
          System.out.println( findLongestsubString("abcefghijaklopqrqpst"));
	  int arr[]= {16,2,2,0,24,1,56};
	//int k=  findMiddleIndex(arr);
	// System.out.println(k+1);
	      findTwoMaxValues(arr);
	}
	public static boolean isStringUnique(String a) {
		boolean isUnique=false;
	   for(char b:a.toCharArray()) {
		   
		   if(a.indexOf(b)==a.lastIndexOf(b))
			   isUnique=true;
		   else {
			   isUnique=false; 
			   break;
		   }
	   }
		
		
		return isUnique;
	}
	public static int findLongestsubString(String a) {
		Map<Character,Integer> maps = new TreeMap<Character,Integer>();
		int len=0; 
		 for(char b:a.toCharArray()) {
			 if(!maps.containsKey(b))
				 maps.put(b, 1);
			 else {
				 System.out.println(maps.toString());
				 len = Math.max(len, maps.size());
				 maps.clear();
			 }
		 }
		  return len;
	}
	public static int findMiddleIndex(int[]a) throws Exception {
		int startIndex=0;
		int lastIndex=a.length-1;
		int sumRight=0,sumLeft=0;
		while(true) {
		   if(sumRight>sumLeft)
			   sumLeft += a[lastIndex--];
		   else
			   sumRight += a[startIndex++];
		   if(startIndex>lastIndex) {
			   if(sumRight==sumLeft)
				   break;
			   else
				   throw new Exception("invalid array");
			   
		   }
		}
		return lastIndex;
	}
	public static void findTwoMaxValues(int []a) {
		int max=a[0],secondMax=a[0];
		 for(int i=0; i<a.length;i++) {
			 if(max<a[i]) {
				secondMax=max;
				 max=a[i];
			 }
			 else
				 if(secondMax<a[i] || max ==secondMax)
				 secondMax=a[i];
		 }
		 System.out.println("FirstMax: "+max +"\n SecondMax: "+secondMax);
	}
  
}
