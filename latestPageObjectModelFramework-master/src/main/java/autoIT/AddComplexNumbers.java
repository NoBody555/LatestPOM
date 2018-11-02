package autoIT;

public class AddComplexNumbers {
 int x,y;
 AddComplexNumbers(){}
	 AddComplexNumbers(int x,int y){
		 this.x=x;
		 this.y=y;
	 }
	 AddComplexNumbers changeNumber(AddComplexNumbers m, AddComplexNumbers n) {
		 AddComplexNumbers sum = new AddComplexNumbers();
		  sum.x=m.x+n.x;
		  sum.y=m.y+n.y;
		 return sum;
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AddComplexNumbers obj1 = new AddComplexNumbers(5,5);
		 AddComplexNumbers obj2= new AddComplexNumbers(1,5);
		 AddComplexNumbers sum = new AddComplexNumbers();
		 AddComplexNumbers su = sum.changeNumber(obj1, obj2);
		 System.out.println(su.x);
		 System.out.println(su.y);
	} 

}
