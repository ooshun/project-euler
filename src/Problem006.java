
public class Problem006 {
	public static void main(String[] args) {
		int value = 100;
		int sum = (value + 1) * value / 2;
		int sumMul = sum * sum;
		int mul = value * (value + 1) * (2 * value + 1) / 6;

		System.out.println(sumMul - mul);
	}
}
