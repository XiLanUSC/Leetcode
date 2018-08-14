
public class Test28 {
	public static int strStr(String haystack, String needle) {
		
		if (needle.equals(""))
			return 0;
		if (needle.length() > haystack.length())
			return -1;
		for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			int temp = i;
			for (int j = 0; j < needle.length(); j++,temp++) {
				if (haystack.charAt(temp) != needle.charAt(j))
					break;
				if (temp == i + needle.length() - 1)
					return i;
				
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("mississippi","mississippi"));
	}
}
