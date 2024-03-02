package for2arrayprogramhw;
//print capital letters string
public class Demo9thquestion {
	public static void main(String[]args) {
		String[] word= {"APPLE","orange","BANANA","waTermelon","PomGranate"};
	for(int i=0;i<word.length;i++) {
		if(word[i].charAt(i) >= 'A' && word[i].charAt(i) <= 'Z'){
		System.out.println(word[i]);
	}
	}
	}
}
