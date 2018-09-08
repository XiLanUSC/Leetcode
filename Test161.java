
public class Test161 {
	public boolean isOneEditDistance(String s, String t) {
		if (Math.abs(s.length() - t.length()) >= 2)
			return false;
		if(s.equals(t))return false;
		boolean changed = false;
		if(s.length()<t.length()) {
			String temp = s;
			s =t;
			t = temp;
		}
		if (s.length() > t.length()) {
			int is = 0;
			for(int i = 0;i<t.length();i++) {
				if(!changed&&s.charAt(is) != t.charAt(i)) {
					is++;
					i--;
					changed = true;
				}else if(s.charAt(is)!=t.charAt(i)) {
					return false;
				}else {
					is++;
				}
			}
		} else {
			for(int i = 0;i<t.length();i++) {
				if(!changed&&s.charAt(i)!=t.charAt(i)) {
					changed = true;
				}else if(s.charAt(i)!=t.charAt(i)) {
					return false;
				}
			}
		}
		return true;
	}
}
