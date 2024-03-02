package hwprgs;

public class Clgbag  extends Officebag implements Bag {
	public String findbagtype(int size) {
		return "Size="+size;
		}
	public boolean isLaptop(boolean lspace) {
		return lspace;
	}
	
	public boolean findleather(String a) {
		
		return false;
	}
}
