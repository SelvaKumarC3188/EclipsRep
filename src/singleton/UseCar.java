package singleton;

public class UseCar {
public static void main(String[]args) {
	Car c1=Car.get();
	Car c2=Car.get();
	System.out.println("c"+c1);
	System.out.println("c"+c2);
	
}
}
