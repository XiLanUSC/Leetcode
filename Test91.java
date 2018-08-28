
public class Test91 {
	public int numDecodings(String s) {
		//int count = 0;
		
		return get(s);

	}

	private int get(String s) {
		if (s.length() > 2) {
			// for(int i = 1;i<s.length()-1;i++)
			int mid = s.length() / 2;
			return (get(s.substring(0, mid)) + get(s.substring(mid, s.length())));
		} else if (s.length() == 2) {
			if (Integer.parseInt(s) > 26)
				return 1;
			else
				return 2;
		} else if (s.length() == 1)
			return 1;
		else
			return 0;
	}
}
