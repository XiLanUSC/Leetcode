
public class Test13 {
	public static int romanToInt(String s) {
		int rs = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'I') {
				if (i != s.length() - 1 && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
					rs--;
					continue;
				} else {
					rs += 1;
				}
			} else if (s.charAt(i) == 'X') {
				if (i != s.length() - 1 && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
					rs -= 10;
					continue;
				} else {
					rs += 10;
				}
			} else if (s.charAt(i) == 'C') {
				if (i != s.length() - 1 && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
					rs -= 100;
					continue;
				} else {
					rs += 100;
				}
			} else if (s.charAt(i) == 'V') {
				rs += 5;
			} else if (s.charAt(i) == 'D') {
				rs += 500;
			} else if (s.charAt(i) == 'L') {
				rs += 50;
			} else if (s.charAt(i) == 'M') {
				rs += 1000;
			}

		}

		return rs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("MCMXCIV"));
	}

}
