package hwprgs;

public class BMW implements RaceCar,SprortsCar {
	public int price;
	public String brand;
	public int findNetprice(int price, int taxper) {
	return price+price*taxper/100;
	}
	public int findTopspeed(int speed) {
		return speed;
		
	}
	public int carLength(int length) {
		return length;
	}

}
