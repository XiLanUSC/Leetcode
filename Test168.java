
public class Test168 {
	public String convertToTitle(int n) {
		String rs = "";
		while (n > 0) {
			int temp = n % 26;
			if (temp == 0)
				temp = 26;
			rs = (char) (64 + temp) + rs;
			if (temp == 26)
				n = n / 26 - 1;
			else
				n = n / 26;
		}
		return rs;
	}
}
