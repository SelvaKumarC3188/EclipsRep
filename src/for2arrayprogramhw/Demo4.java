package for2arrayprogramhw;
//lowest string length   //Individual type
public class Demo4 {
	public static void main(String[]args) {
		String[] word=new String[5];
		word[0]="Murali";
		word[1]="Ashok";
		word[2]="Selvakumarc";
		word[3]="Siranjeevi";
		word[4]="Manimaran";
		String mini=word[0];
		for(int i=0;i<word.length;i++) {
			if(word[i].length()<mini.length()) {
				mini=word[i];
				}
		}
		System.out.println(mini);
	}

}
