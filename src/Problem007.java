
public class Problem007 {

	public static boolean prime(int p) {
		for (int i = 3; i < Math.sqrt(p) + 1; i += 2) {
			if (p % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int count = 1;
		int i = 3;
		int n = 10001;
		while (count < n) {
			if (prime(i) == true) {
				count++;
			}
			i += 2;
		}
		System.out.println(i - 2);
	}
}
