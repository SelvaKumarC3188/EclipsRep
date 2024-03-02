package collection1;
import java.util.ArrayList;
public class DemoCharAt {
	public static void main(String[]args) {
		String[] ch=args[0].split(",");
		char c1=ch[0].charAt(0);
		char c2=ch[1].charAt(0);
		char c3=ch[2].charAt(0);
		char c4=ch[3].charAt(0);
		
		ArrayList<Character> cha=new ArrayList<>();
		cha.add(c1);
		cha.add(c2);
		cha.add(c3);
		cha.add(c4);
		for(int i=0;i<cha.size();i++) {
			System.out.println(cha.get(i));
		}
	}
}