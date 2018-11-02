import java.util.Random;

public class StringNumberGeneratation {

	public static void main(String[] args) {
		
	
	 Random rand = new Random();
     
     int i=0;
     while(i<5){
         int result =  rand.nextInt(9000000)+1000000;
         System.out.println(result);
         i++;
     }
    
   String ab="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
       StringBuilder sb  = new StringBuilder();
    while(sb.length()<11){
        int index =  (int) (rand.nextFloat()*ab.length());
        sb.append(ab.charAt(index));
    }
    System.out.println(sb.toString());
   }
}
