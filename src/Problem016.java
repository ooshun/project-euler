
public class Problem016 {
	public static void main(String[] args) {
		int digits[] = new int[100000];

		//initialize
		for (int i = 0; i < digits.length; i++) {
			digits[i] = 0;
		}

		digits[0] = 1;//2^0
		int len = 1;

		for (int i = 1; i <= 1000; i++) {
			for (int j = 0; j < len; j++) {
				digits[j] *= 2;
			}
			for (int j = 0; j < len; j++) {
				if (digits[j] >= 10) {
					digits[j] -= 10;
					digits[j + 1] += 1;
					if (j == len - 1) {
						len++;
					}
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < len; i++) {
			System.out.println(i + "=" + digits[i]);
			sum += digits[i];
		}
		System.out.println("");
		System.out.print(sum);
	}
}
