package autoIT;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDubplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Map<Character,Integer> maps = new TreeMap<Character,Integer>();
      String abc="javajvblblb";
      ArrayList<Character> arr= new ArrayList<Character>();
      for(char ab:abc.toCharArray()) {
    	 if(maps.containsKey(ab)) {
    		  
    		  maps.put(ab, maps.get(ab)+1);
    	  }else
    		  maps.put(ab, 1);
         }
    	  
      
      Set<Character> keys = maps.keySet();
       for(char key:keys) {
    	   if(maps.get(key)>1)
    		   System.out.println(key+" : "+maps.get(key));
       }
       String wo="Java the concept of the Day";
       String[] w= wo.split(" ");
       for(int i=0; i<w.length; i++) {
    	   String word =w[i];
    	   for(int j=word.length()-1; j>=0; j--)
    		   System.out.print(word.charAt(j));
    	   
    	    System.out.print(" ");
       }
       int arre[]= {10,40,30,20,5};
       int max=arre[0],min=arre[0];
      for(int i=0; i<arre.length;i++) {
    	  if(max<arre[i])
    		  max=arre[i];
    	  if(min>arre[i])
    		  min=arre[i];
      }
      System.out.println();
      int sum=max-min;
      System.out.println("("+max+" - "+min+") = "+sum);
      System.out.println(simpleDate());
      System.out.println(java.time.LocalDateTime.now());
      System.out.println(java.time.LocalTime.now());
	}
  public static String simpleDate() {
	  SimpleDateFormat format = new SimpleDateFormat("dd//MM/yy HH:mm:ss");
	  Date date = new Date();
	String dt = format.format(date);
	  
	  return dt;
  }
}
