package newfunctionhw;

public class CountDigit {
	public int findcount(int num) {
		int count = 0;
		for (; num > 0;) {
			num = num / 10;
			count++;
		}
		return count;
	}
}
