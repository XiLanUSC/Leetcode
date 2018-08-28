import java.util.ArrayList;
import java.util.List;

public class Test89 {
	public List<Integer> grayCode(int n) {
		List<Integer> rs = new ArrayList();
		List<String> temp = new ArrayList();

		String s = "";
		for (int i = 0; i < n; i++)
			s = s + "0";
		
		return rs;
	}

	private int getInteger(String s) {
		int rs = 0, multi = 1;
		for (int i = s.length() - 1; i >= 0; i--) {
			rs += Integer.parseInt(s.charAt(i) + "") * multi;
			multi *= 2;
		}
		return rs;
	}

	private void get(List<String> temp, String s, int pos, int len, boolean first) {
		if (s.charAt(pos) == '1') {
			s = s.substring(0, pos) + "0" + s.substring(pos + 1, len);
		} else if (s.charAt(pos) == '0') {
			s = s.substring(0, pos) + "1" + s.substring(pos + 1, len);
		}
		temp.add(s);
		if (pos != len - 1)
			get(temp, s, pos + 1, len, false);
		
		
		if (!first) {
			if (s.charAt(pos) == '1') {
				s = s.substring(0, pos) + "0" + s.substring(pos + 1, len);
			} else if (s.charAt(pos) == '0') {
				s = s.substring(0, pos) + "1" + s.substring(pos + 1, len);
			}
			get(temp, s, pos + 1, len, false);
		}

	}
}
