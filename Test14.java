
public class Test14 {
	public static String longestCommonPrefix(String[] strs) {
		if(strs.length == 0)return "";
		if(strs.length == 1)return strs[0];
		String rs = "";
		int len = Integer.MAX_VALUE;
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() < len)
				len = strs[i].length();
		}
		boolean breakout = false;
		for (int i = 0; i < len; i++) {
			char temp = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (strs[j].charAt(i) != temp) {
					breakout = true;
					break;
				}
			}
			if (breakout)
				return rs;
			rs += temp;
		}

		return rs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"c","c"};
		System.out.println(longestCommonPrefix(s));
	}

}
