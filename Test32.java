import java.util.Stack;

public class Test32 {
	public static int longestValidParentheses(String s) {
		int countMax = 0;
		System.out.println(s.length());
		Stack ss = new Stack();
		for (int i = 0; i < s.length(); i++) {
			int temp = 0;
			for (int j = i; j < s.length(); j++) {
				//System.out.println(j+" "+s.charAt(j));
				if (s.charAt(j) == ')') {
					if (ss.isEmpty()) {
						if (temp > countMax)
							countMax = temp;
						break;
					} else {
						//System.out.println("else");
						ss.pop();
						temp += 2;
					}
				} else if (s.charAt(j) == '(') {
					//System.out.println('(');
					ss.push('(');
				}
				if (ss.isEmpty()) {
					if (temp > countMax)
						countMax = temp;
				}
			}
			ss.removeAllElements();
		}
		return countMax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = ")(((((()())()()))()(()))(";
		System.out.println(longestValidParentheses(s));
	}

}
