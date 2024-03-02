package for2arrayprogramhw;
//Take String array print highest string length   //Bulk type
public class Demo3 {
  public static void main(String[]args) {
	  String[] word= {"fan","light","laptop","Ironbox", "At"};
	  String max=word[0];
	  for(int i=0;i<word.length;i++) {
		  if(word[i].length()>max.length()) {
			  max=word[i];			  
		  }		  
	  }
	  System.out.println("highest length word is="+max);
	  }
}
