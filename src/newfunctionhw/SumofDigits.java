package newfunctionhw;

public class SumofDigits {
	public int findsum(int num) {
		int sum = 0;
		for (;num>0;) {
			int r = num % 10;
			sum = sum + r;
			num = num / 10;

		}
		return sum;
	}

}
