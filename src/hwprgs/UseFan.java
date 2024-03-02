package hwprgs;

public class UseFan {
	public static void main(String[]args) {
		Fan f1=new Fan();
	    f1.brand=args[0];
	    f1.price=Integer.parseInt(args[1]);
	    f1.colour=args[2];
	    f1.weight=Float.parseFloat(args[3]);
	    System.out.println(f1.brand+" "+f1.price+" "+f1.colour+" "+f1.weight);
	}
	

}
