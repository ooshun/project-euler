/*You are given the following information, but you may prefer to do some research for yourself.

1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?*/

public class Problem019 {
	public static void main(String[] args) {
		int dayofWeek = 1;
		int month = 0;
		int year = 1900;
		int countSunday = 0;

		while (year < 2001) {
			int m = (month + 1 - 3 + 4800) % 4800;
			int y = (year + m / 12) % 400;
			m %= 12;
			int k = (y + y / 4 - y / 100 + (13 * m + 2) / 5 + 1 + 2) % 7;

			if (k == 0) {
				System.out.println("ZZZZZyear" + year + "month" + (month + 1));
			}
			if (dayofWeek % 7 == 0 && year >= 1901) {
				countSunday++;
				System.out.println("year" + year + "month" + (month + 1));
			}
			//			System.out.println("year" + year + "month" + (month + 1) + "dayofWeek" + dayofWeek);
			if (month == 0 || month == 2 || month == 4 || month == 6 || month == 7 || month == 9 || month == 11) {
				dayofWeek += 3;
			}
			//2月
			else if (month == 1) {
				if (year % 4 == 0 && year % 400 != 0 && year % 100 != 0 && month == 1) {//うるう年
					dayofWeek += 1;
				} //うるう年ではないなら何もしない
			} else {
				dayofWeek += 2;
			}

			dayofWeek %= 7;
			if (month == 11) {//12月なら次の年の
				year++;
				month = 0;
			} else {
				month++;
			}
		}
		System.out.println(countSunday);
	}
}
