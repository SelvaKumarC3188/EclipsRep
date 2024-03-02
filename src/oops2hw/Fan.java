package oops2hw;

public class Fan {
	private String brand;
	private String colour;
	private int price;
	
	public void setBrand(String a) {
	     brand=a;
	}
    public String getBrand() {
    	return brand;
    }
    public void setColour(String b) {
    	colour=b;
    }
    public String getColour() {
    	return colour;
    }
    public void setPrice(int c) {
    	price=c;
    }
    public int getPrice() {
    	return price;
    }
    public Fan(String a,String b,int c) {
    	brand=a;
    	colour=b;
    	price=c;
    }
    public String toString() {
    	return brand+" "+colour+" "+price;
    }
}
