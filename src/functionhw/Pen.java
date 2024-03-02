package functionhw;

public class Pen {
	String name;
	int price;
	String color;
public int findavg(Pen[] pens) {
	int sum=0;
	for(Pen p:pens) {
		sum=sum+p.price;
	}
	int average=sum/pens.length;
	return average;
}
}
