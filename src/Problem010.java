
public class Problem010 {

	public static boolean isPrime(int p) {
		if (p == 2 || p == 3) {
			return true;
		} else if (p % 2 == 0) {//偶数のとき
			return false;
		}
		for (int i = 3; i < Math.sqrt(p) + 1; i += 2) {
			if (p % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		long sum = 2;
		for (int i = 3; i <= 2000000; i++) {
			if (isPrime(i) == true) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
