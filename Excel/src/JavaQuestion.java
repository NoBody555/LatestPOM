abstract class dc{
  public abstract void cm();
}
public class JavaQuestion extends dc{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*JavaQuestion ob = new JavaQuestion();
		ob.cm();*/
		//you can multiple interfaces with the same method and same return type only will get invoked
		//no ambiguity will occur
		//abstract methods cannot be static since they're suppose to be overridden
		String m="amjjaaksjssk";
	       String n="";
	       
	       for(int i=0,count=1; i<m.length(); i++){
	           if(i+1<m.length() && m.charAt(i)==m.charAt(i+1))
	                count++;
	                else{
	                  n  = n.concat(Character.toString(m.charAt(i)));
	                   if(count>1)
	                   n= n.concat(Integer.toString(count));
	                   count=1;
	                }
	         
	       }
	      System.out.print(n);
	}


	public void cm() {
		// TODO Auto-generated method stub
		System.out.println("Common to all");
	}

}
