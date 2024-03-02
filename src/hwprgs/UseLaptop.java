package hwprgs;

public class UseLaptop {
	public static void main(String[]args) {
		String[] ll=args[0].split(",");
		Laptop l1=new Laptop();
		l1.brand=ll[0];
		l1.price=Integer.parseInt(ll[1]);
		l1.colour=ll[2];
		l1.weight=Float.parseFloat(ll[3]);
		System.out.println("Brand="+l1.brand+"Price="+l1.price+"Colour="+l1.colour+"Weight="+l1.weight);
		
		
	}
	

}
