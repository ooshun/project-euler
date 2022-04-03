
public class Problem020 {
	public static void main(String[] args) {
		int digits[] = new int[100000];

		//initialize
		for (int i = 0; i < digits.length; i++) {
			digits[i] = 0;
		}

		digits[0] = 1;//1!
		int len = 1;
		int n = 100;//n!
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < len; j++) {
				digits[j] *= i;
			}
			for (int j = 0; j < len; j++) {
				if (digits[j] >= 10) {
					int cary = digits[j] / 10;
					digits[j] %= 10;
					digits[j + 1] += cary;
					if (j == len - 1) {
						len++;
					}
				}
			}
			int count0 = 0;
			boolean isZero = true;
			for (int j = 0; j < len; j++) {//count 0
				if (isZero == true && digits[j] == 0) {
					count0++;
				} else {
					isZero = false;
				}
			}
			for (int j = 0; j < len - count0; j++) {
				digits[j] = digits[j + count0];
			}
			for (int j = len - count0; j < len; j++) {
				digits[j] = 0;
			}
			len -= count0;

		}
		int sum = 0;
		System.out.println("------------------------------");
		for (int i = 0; i < len; i++) {
			System.out.println(i + "=" + digits[i]);
			sum += digits[i];
		}
		System.out.println("");
		System.out.print(sum);
	}
}
