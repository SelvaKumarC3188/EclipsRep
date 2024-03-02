package newfunctionhw;

public class ArmstrongNumbers {
	public void findamstr(int num) {
		for (int i=100;i<=1000;i++) {
			int a=i;
			int sum=0;
			int n=a;
			for(;a>0;) {
				int r=a%10;
				sum=sum+r*r*r;
				a=a/10;
			}
			if(sum==n) {
				System.out.println(n +"isAmstrong");
				}
		}
	}
}
