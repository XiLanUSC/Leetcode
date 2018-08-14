import java.util.Stack;

public class Test32_2 {
	public static int longestValidParentheses(String s) {
		int rs = 0;

		Stack ss = new Stack();
		int[] mark = new int[s.length()];
		for (int i = 0; i < mark.length; i++)
			mark[i] = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ')') {
				if (ss.isEmpty()) {
					continue;
				} else {
					int temp = (int) ss.pop();
					mark[i] = 1;
					mark[temp] = 1;
				}
			} else if (s.charAt(i) == '(') {
				ss.push(i);
			}
		}
		for (int i = 0; i < mark.length; i++) {
			int temp = 0;
			while (i<mark.length&&mark[i] != 0) {
				temp++;
				i++;
			}
			if (temp > rs)
				rs = temp;
		}

		return rs;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = ")(((((()())()()))()(()))(";
		System.out.println(longestValidParentheses(s));
	}

}
