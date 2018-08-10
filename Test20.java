import java.util.Stack;

public class Test20 {
	public boolean isValid(String s) {
		if (s.equals(""))
			return true;
		Stack ss = new Stack();
		ss.push(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			if (!ss.empty()&&((s.charAt(i) == ')' && (char) ss.peek() == '(') || (s.charAt(i) == ']' && (char) ss.peek() == '[')
					|| (s.charAt(i) == '}' && (char) ss.peek() == '{'))) {

				ss.pop();
			} else {
				ss.push(s.charAt(i));
			}
		}
		if (ss.empty())
			return true;
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
