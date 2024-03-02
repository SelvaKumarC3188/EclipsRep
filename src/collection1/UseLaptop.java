package collection1;
import java.util.ArrayList;
public class UseLaptop {
	public static void main(String[] args) {
     Laptop l1=new Laptop("Dell","Black",95000);
     Laptop l2=new Laptop("hp","Silver",65000);
     Laptop l3=new Laptop("Acer","White",45000);
     ArrayList<Laptop> lap = new ArrayList<>();
     lap.add(l1);
     lap.add(l2);
     lap.add(l3);
     Laptop max=lap.get(0);
     for(int i=0;i<lap.size();i++) {
    	 if(lap.get(i).getPrice()>max.getPrice()) {
				max=lap.get(i);
    	 }
     }
     System.out.println(max.getBrand());
	}
}

	
	
   