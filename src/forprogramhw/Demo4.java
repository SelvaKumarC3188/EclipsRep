package forprogramhw;

public class Demo4 {
	public static void main(String[] args) {
		String a="S#F$ji8902%@FGK";
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>='0'&&a.charAt(i)<='9') {
				System.out.println(a.charAt(i));
			}
		}
	}
}
