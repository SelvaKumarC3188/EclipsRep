package for2arrayprogramhw;
//Find mininum value number //Bulk initialisation
public class Demo2 {
	public static void main(String[]args) {
		int[] num={123,56,87,65,8,95};
		int mini=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]<mini) {
				mini=num[i];
			}
		}
		System.out.println(mini);
	}
}
