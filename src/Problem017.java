
public class Problem017 {

	public static int letters(int i) {
		switch (i) {
		case 1:
			return 3;//one
		case 2:
			return 3;//two
		case 3:
			return 5;//three
		case 4:
			return 4;//four
		case 5:
			return 4;//five
		case 6:
			return 3;//six
		case 7:
			return 5;//seven
		case 8:
			return 8;//eight
		case 9:
			return 4;//nine
		default:
			//			System.out.println("0");
			return 0;

		}
	}

	public static int letters10(int bottom, int i) {
		switch (bottom) {
		case 1:
			int ab = i % 100;
			switch (ab) {

			case 10:
				return 3;//ten
			case 11:
				return 6 - letters(i % 10);//eleven
			case 12:
				return 6 - letters(i % 10);//twelve
			case 13:
				return 8 - letters(i % 10);//thirteen
			case 14:
				return 8 - letters(i % 10);//fourteen
			case 15:
				return 7 - letters(i % 10);//fifteen
			case 16:
				return 7 - letters(i % 10);//sixteen
			case 17:
				return 9 - letters(i % 10);//seventeen
			case 18:
				return 8 - letters(i % 10);//eighteen
			case 19:
				return 8 - letters(i % 10);//nineteen
			}
		case 2:
			return 6;//twenty
		case 3:
			return 6;//thirty
		case 4:
			return 5;//forty
		case 5:
			return 5;//fiftyj
		case 6:
			return 5;//sixty
		case 7:
			return 7;//seventy
		case 8:
			return 6;//eighty
		case 9:
			return 6;//ninety
		default:
			System.out.println("00");
			return 0;

		}
	}

	public static void main(String[] args) {
		long sum = 0;
		for (int i = 1; i <= 100; i++) {
			int length = 0;
			int num = i;
			while (num != 0) {
				int bottom = num % 10;
				//				System.out.println("TK " + length + " " + bottom);
				switch (length) {
				case 0:
					sum += letters(bottom);
					break;
				case 1:
					//					System.out.println("Ha" + sum + "  " + bottom + "  " + length);
					sum += letters10(bottom, i);
					//					System.out.println("ha" + sum + "  " + num + "  " + length);
					break;
				case 2:
					sum += 10 + letters(bottom);//hundred and
					break;
				case 3:
					if (i % 1000 < 100) {
						sum -= 1;//thousand - hundred
						break;
					} else {
						sum += 8;//thousand
						break;
					}
				default:
					System.out.println("bottom");
				}
				num /= 10;

				System.out.println(sum + "  " + num + "  " + length);
				length++;
			}
		}
		System.out.println(sum);
	}
}
