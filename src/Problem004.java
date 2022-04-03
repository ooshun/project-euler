
public class Problem004 {
	public static void main(String[] args) {
		int value = 999;
		int max = 0;
		for (int i = value; i > value / 10; i--) {
			for (int j = value; j > value / 10; j--) {
				boolean flag = true;
				int n = i * j;
				int count = 0;
				int m = n;
				while (m != 0) {
					count++;
					m = m / 10;
				}
				m = n;
				int num[] = new int[count];
				for (int c = 0; c < count; c++) {
					num[c] = m % 10;
					m = m / 10;
				}
				for (int c = 0; c < count / 2; c++) {
					if (num[c] != num[count - c - 1]) {
						flag = false;
						break;
					}
				}
				if (flag && max < n) {
					max = n;
				}
			}
		}

		System.out.println(max);
	}
}
