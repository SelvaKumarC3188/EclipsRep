package newfunctionhw;

public class DublicateIint {
	public int[] finddub(int[] num) {
		int[] b = new int[num.length];
		for (int i = 0; i < num.length; i++) {
			int count = 0;
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					count++;
					num[j] = '%';
				}
			}
			if (count > 0 && num[i] != '%') {
				b[i] = num[i];
			}
		}
		return b;
	}
}
