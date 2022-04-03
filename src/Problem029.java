import java.util.HashSet;
import java.util.Set;

public class Problem029 {
	public static void main(String[] args) {
		int a = 2;
		int b = 2;
		int n = 100;
		Set<Integer> set = new HashSet<Integer>();
		for (a = 2; a <= n; a++) {
			for (b = 2; b <= n; b++) {
				set.add((int) (Math.pow(a, b)));
			}
			if (Math.pow(a, b) > 10000000) {
				System.out.println("AAAAA");
			}
		}
		System.out.println(set.size());
	}
}
