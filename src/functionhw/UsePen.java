package functionhw;


public class UsePen {
	public static void main(String[]args) {
		Pen pen1=new Pen();
		pen1.name="Cello";
		pen1.price=100;
		pen1.color="Red";
		
		Pen pen2=new Pen();
		pen2.name="Nataraj";
		pen2.price=45;
		pen2.color="Blue";
		
		Pen pen3=new Pen();
		pen3.name="Flair";
		pen3.price=85;
		pen3.color="Black";
		
		Pen[] pens= {pen1,pen2,pen3};
		
		Pen p5=new Pen();
		int c=p5.findavg(pens);
		System.out.println(c);
	}
}
