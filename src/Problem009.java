
public class Problem009 {
	public static void main(String[] args) {

		int mul = 1;
		out: for (int m = 1; m < 100; m++) {
			for (int n = 1; n <= m; n++) {
				if (2 * m * m + 2 * m * n == 1000) {
					mul = (m * m - n * n) * 2 * m * n * (m * m + n * n);
					break out;
				}
			}
		}
		System.out.println(mul);
	}
}
