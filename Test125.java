
public class Test125 {
	public boolean isPalindrome(String s) {
		if (s.equals(""))
			return true;
		int i = 0, j = s.length() - 1;

		while (i <= j) {
			while (i <= j && !((s.charAt(i) >= '0' && s.charAt(i) <= '9') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
					|| (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'))) {
				i++;
			}
			while (j >= i && !((s.charAt(j) >= '0' && s.charAt(j) <= '9') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z')
					|| (s.charAt(j) >= 'a' && s.charAt(j) <= 'z'))) {
				j--;
			}
			char tempi = s.charAt(i), tempj = s.charAt(j);
			
			if (i >= j)
				break;
			if (tempi >= 'a' && tempi <= 'z') {
				tempi = (char) (tempi-32);
			}
			if (tempj >= 'a' && tempj <= 'z') {
				
				tempj = (char) (tempj-32);
			}
			if (tempi != tempj){
				System.out.println(tempi+"  "+tempj);
				return false;
			}

			i++;
			j--;
		}

		return true;
	}
	public static void main(String args[]) {
		char tempj = 'a';
		if (tempj >= 'a' && tempj <= 'z') {
			
			tempj = (char) (tempj-32);
		}
		System.out.println(tempj);
	}
}
