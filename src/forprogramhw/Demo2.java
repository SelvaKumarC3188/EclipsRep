package forprogramhw;

public class Demo2 {
	public static void main (String[]args) {
		int fact=1;
		for(int i=6;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
		int e=8;
		boolean t=true;
		for(int i=2;i<e;i++) {
			if(e%i==0) {
				t=false;
			}
			if(t==true) {
				//System.out.println("prime");
			}
			else {
				//System.out.println("notprime");
			}
		}
		}
	}
