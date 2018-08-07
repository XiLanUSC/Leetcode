
public class Test9 {
	public static boolean isPalindrome(int x) {
		if (x < 0)
			return false;

		String s = x + "";
		for(int i = 0;i<s.length()/2;i++) {
			if(s.charAt(i) != s.charAt(s.length()-1-i)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1023001;
		System.out.println(isPalindrome(i));
	}
}
