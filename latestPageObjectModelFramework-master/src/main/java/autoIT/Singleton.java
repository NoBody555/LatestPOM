package autoIT;

public class Singleton {
    public static Singleton obj = new Singleton ();
     private Singleton() {}
     public static Singleton getInstance() {
    	 return obj;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Singleton.getInstance();
        //Singleton objs = new Singleton();
        
	}

}
