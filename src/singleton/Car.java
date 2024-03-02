package singleton;

public class Car {

	private String brand;
	private int price;
	private int cc;
	private static Car c = null;

	private Car() {
	}

	static Car get() {
		if (c == null) {
			c = new Car();
		}
		return c;

	}
}
