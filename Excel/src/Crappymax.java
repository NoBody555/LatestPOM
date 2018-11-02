import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Crappymax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
	     String rav="super man he man cone man dumb man";
	     //output man super man he man cone man dumb
	     String [] ra =rav.split(" ");
	     String c="";
	     String p = "abab";
	     for(int i=0; i<ra.length; i++) {
	    	 if(i+1<ra.length) {
	            c+= ra[i+1];
	            c += " ";
	            c+= ra[i];
	            c += " ";
	            i++;
	    	 
	    	 }
	    	 SimpleDateFormat smf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");;
	    	Date date = new Date();
	     String dt = smf.format(date);
	       //
	    	// System.out.println(rav.charAt(i));
	     }
	    //System.out.println(c);
	  // 	 Arrays.sort(ad);(returnPalindrom(p));
	     
	     String ab="abc";
	     String ba ="bca";
	    if(ba.length()!=ab.length())
	    	System.out.println("length are the same");
	  char ad[]=  ab.toCharArray();
	 char bd[]=   ba.toCharArray();
	 Arrays.sort(ad); 	 Arrays.sort(bd);
	
	 System.out.println( Arrays.equals(ad,bd));
	}
	public static int returnPalindrom(String  p) {
	//	StringBuilder s = new StringBuilder(p);
	    String k="";
	     for(int i=0; i<p.length();i++) {
	    	 if(i==0){
	         k+="a"+p;
	         return 1;
	    	 }
	    	 
	        if(i==p.length()-2) {
	    	  k+="b";
	    	 return 1;
	    	}
	     }

	    return 0;
	    
	    
	   
	}

}
