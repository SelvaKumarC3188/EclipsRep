package forprogramhw;

public class Deom8 {
public static void main(String[]args) {
	String a="earth";
	int count1=0;
	for(int i=0;i<=a.length()-1;i++) {
		if(a.charAt(i)!='a'&&a.charAt(i)!='e'&&a.charAt(i)!='i'&&a.charAt(i)!='o'&&a.charAt(i)!='u') {
						count1++;
						System.out.println(a.charAt(i));
		}
	}
	System.out.println("consonent count is "+count1);		
	
}
}
