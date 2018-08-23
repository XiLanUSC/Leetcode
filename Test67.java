
public class Test67 {
	public static String addBinary(String a, String b) {
		if (a.length() < b.length()) {
			String temp = a;
			a = b;
			b = temp;
		}
		String rs = "";
		int lena = a.length(), lenb = b.length();
		boolean add = false;
		for (int i = 0; i < lena; i++) {
			if (i >= lenb) {
				if (add) {
					if (a.charAt(lena - i - 1) == '1') {
						rs = "0" + rs;
						add = true;
					} else {
						rs = "1" + rs;
						add = false;
					}
				} else {
					if (a.charAt(lena - i - 1) == '1') {
						rs = "1" + rs;
						add = false;
					} else {
						rs = "0" + rs;
						add = false;
					}
				}
			} else {
				if (add) {
					if (a.charAt(lena - i - 1) == '1' && b.charAt(lenb - i - 1) == '1') {
						rs = "1" + rs;
						add = true;
					} else if ((a.charAt(lena - i - 1) == '1' && b.charAt(lenb - i - 1) == '0')
							|| (a.charAt(lena - i - 1) == '0' && b.charAt(lenb - i - 1) == '1')) {
						rs = "0" + rs;
						add = true;
					} else if (a.charAt(lena - i - 1) == '0' && b.charAt(lenb - i - 1) == '0') {
						rs = "1" + rs;
						add = false;
					}
				} else {
					if (a.charAt(lena - i - 1) == '1' && b.charAt(lenb - i - 1) == '1') {
						rs = "0" + rs;
						add = true;
					} else if ((a.charAt(lena - i - 1) == '1' && b.charAt(lenb - i - 1) == '0')
							|| (a.charAt(lena - i - 1) == '0' && b.charAt(lenb - i - 1) == '1')) {
						rs = "1" + rs;
						add = false;
					} else if (a.charAt(lena - i - 1) == '0' && b.charAt(lenb - i - 1) == '0') {
						rs = "0" + rs;
						add = false;
					}
				}
			}
		}
		if (add)
			rs = "1" + rs;

		return rs;
	}

	public static void main(String args[]) {
		System.out.println(addBinary("100", "110010"));
	}
}
