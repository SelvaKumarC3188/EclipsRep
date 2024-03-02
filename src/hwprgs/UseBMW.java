package hwprgs;

public class UseBMW {
	public static void main(String[]args) {
	BMW bmw=new BMW();
	bmw.brand="BMW";
	bmw.price=25000000;
	System.out.println(bmw.findNetprice(25000000,10)+","+bmw.findTopspeed(250));
	//System.out.println(bmw.findTopspeed(250));
	System.out.println(bmw.brand);
	
	}	

}
