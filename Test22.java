import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test22 {
	public List<String> generateParenthesis(int n) {
		List<String> rs = new ArrayList();
		if (n == 0)
			return rs;
		char[] buffer = new char[2*n];
		make(rs,n,n,buffer,0);

		return rs;
	}

	private void make(List<String> rs, int left, int right, char[] buffer, int count) {
		if (left < 0 || right < left)
			return;
		if (left == 0 && right == 0) {
			String s = String.copyValueOf(buffer);
			rs.add(s);
		} else {
			if (left > 0) {
				buffer[count] = '(';
				make(rs, left - 1, right, buffer, count + 1);
			}
			if (right > left) {
				buffer[count] = ')';
				make(rs, left, right-1, buffer, count + 1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
