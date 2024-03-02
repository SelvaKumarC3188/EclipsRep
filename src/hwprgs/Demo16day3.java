package hwprgs;

public class Demo16day3 {
	public static void main(String[]args) {
		String name="Sel783va";
		char name2=name.charAt(name.length()/2);
		if(name2>='A'&&name2<'z') {
			System.out.println("alpha");
		}
			else if(name2>='0'&&name2<'9') {
				System.out.println("num");
			}
				else {
					System.out.println("hi");
				
				}
				
	}
			
		
}	
	


