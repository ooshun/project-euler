import java.util.HashMap;
import java.util.Map;

public class Problem005 {

	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		int mul = 1;
		for (int i = 1; i <= 20; i++) {
			while (mul % i != 0) {
				int val = i;
				for (int j = 2; j <= i; j++) {

					int count = 0;
					if (val % j == 0) {
						while (val % j == 0) {
							count++;
							val = val / j;
						}
						if (map.containsKey(j) == true) {
							if (map.get(j) < count) {
								mul *= j * (count - map.get(j));
								map.put(j, count);
							}
						} else {
							map.put(j, count);
							mul *= j;
						}
					}
				}
			}
		}
		System.out.println(mul);
	}
}
