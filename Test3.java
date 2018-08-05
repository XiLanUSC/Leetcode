
public class Test3 {
	public static int lengthOfLongestSubstring(String s) {
		int rs = 0;
		if (s.equals(""))
			return rs;
		if (s.length() == 1)
			return 1;
		int start = 0;
		int i = 1;
		for (; i < s.length(); i++) {
			// if (i - start - 1 > rs)
			// rs = i - start - 1;
			for (int j = start; j < i; j++) {
				if (s.charAt(j) == s.charAt(i)) {
					if (i - start > rs)
						rs = i - start;
					start = j + 1;
					break;
				}
			}

		}
		if (start == 0)
			rs = s.length();
		if (i - start + 1 > rs)
			rs = i - start;
		return rs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}

}
