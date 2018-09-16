
public class Test273 {
	public static String numberToWords(int num) {
		if (num == 0)
			return "Zero";
		String rs = "";
		int count = 0;

		while (num > 0) {
			if (num % 1000 == 0) {
				num = num / 1000;
				count++;
				continue;
			}
			if (count == 1 && num % 1000 != 0) {
				rs = "Thousand " + rs;
			}
			if (count == 2 && num % 1000 != 0) {
				rs = "Million " + rs;
			}
			if (count == 3 && num % 1000 != 0) {
				rs = "Billion " + rs;
			}
			rs = get1000(num % 1000) + " " + rs;
			num = num / 1000;
			count++;

		}
		while (rs.charAt(rs.length() - 1) == ' ') {
			rs = rs.substring(0, rs.length() - 1);
		}
		return rs;

	}

	private static String get1000(int num) {
		if (num == 0)
			return "";
		String rs = "";
		boolean tens = false;
		int len = 0;
		if (num >= 100)
			len = 3;
		else if (num >= 10)
			len = 2;
		else
			len = 1;
		for (int i = 0; i < len; i++) {
			if (i == 2 && num % 10 != 0)
				rs = get1(num % 10) + " " + "Hundred " + rs;
			if (i == 1) {
				if (tens) {
					if (num % 100 != 0) {
						rs = get10(num % 100) + " " + rs;
						num = num / 10;
					}
				} else {
					if (num % 10 != 0)
						rs = get20(num % 10) + " " + rs;
				}
			}
			if (i == 0 && num % 10 != 0 && (num % 100 >= 20 || num % 100 < 10)) {
				rs = get1(num % 10) + rs;
			} else if (i == 0 && (num % 100 < 20 && num % 100 >= 10)) {
				tens = true;
				continue;
			}
			num = num / 10;
		}
		while (rs.length() != 0 && rs.charAt(rs.length() - 1) == ' ') {
			rs = rs.substring(0, rs.length() - 1);
		}
		return rs;
	}

	private static String get10(int num) {
		if (num == 10)
			return "Ten";
		if (num == 11)
			return "Eleven";
		if (num == 12)
			return "Twelve";
		if (num == 13)
			return "Thirteen";
		if (num == 14)
			return "Fourteen";
		if (num == 15)
			return "Fifteen";
		if (num == 16)
			return "Sixteen";
		if (num == 17)
			return "Seventeen";
		if (num == 18)
			return "Eighteen";
		if (num == 19)
			return "Nineteen";
		return "";
	}

	private static String get20(int num) {

		if (num == 2)
			return "Twenty";
		if (num == 3)
			return "Thirty";
		if (num == 4)
			return "Forty";
		if (num == 5)
			return "Fifty";
		if (num == 6)
			return "Sixty";
		if (num == 7)
			return "Seventy";
		if (num == 8)
			return "Eighty";
		if (num == 9)
			return "Ninety";
		return "";
	}

	private static String get1(int num) {
		if (num == 1)
			return "One";
		if (num == 2)
			return "Two";
		if (num == 3)
			return "Three";
		if (num == 4)
			return "Four";
		if (num == 5)
			return "Five";
		if (num == 6)
			return "Six";
		if (num == 7)
			return "Seven";
		if (num == 8)
			return "Eight";
		if (num == 9)
			return "Nine";
		return "";
	}

	public static void main(String args[]) {
		System.out.println(numberToWords(1));
	}
}
