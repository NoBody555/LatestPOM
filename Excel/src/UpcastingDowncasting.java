 class Car{
    public void start(){
        System.out.println("Car is started");
    }
    
}
class Fiat extends Car{
    public void start(){
        System.out.println("Fiat is started");
    }
    public void smart(){
        System.out.println("fiat is a smart car");
    }
    
}
public class UpcastingDowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub***
		//Upcasting
		Car car = new Fiat();
        car.start();
      //error  car.smart();
        //downcasting
        Car car1 = new Fiat();
        Fiat car2 = (Fiat)car1;
        car2.smart();
	}

}
