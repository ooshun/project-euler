
public class Problem003 {
	public static long fact(long n) {
		int j = 2;
		while (n % j == 0) {
			n = n / j;
		}
		for (int i = 3; i < Math.sqrt(n) + 1; i += 2) {
			if (n % i == 0) {
				j = i;
				while (n % i == 0) {
					n = n / i;
				}
			}
			System.out.println("N = " + n);
		}
		if (j > n) {
			return j;
		} else {
			return n;
		}
	}

	public static void main(String[] args) {
		long L = 600851475143L;
		//		long L = 1023;
		long j = fact(L);
		System.out.println(j);
	}
}
