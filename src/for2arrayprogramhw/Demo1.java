package for2arrayprogramhw;
//Find minimun number //individual initialisation
public class Demo1 {
	public static void main(String[] args) {
		int[] num = new int[6];
		num[0] = 10;
		num[1] = 11;
		num[2] = 20;
		num[3] = 19;
		num[4] = 150;
		num[5] = 2;
		int mini = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < mini) {
				mini = num[i];
			}
		}
		System.out.println(mini);
}
}


