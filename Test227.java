import java.util.Stack;

public class Test227 {
	public int calculate(String s) {
		if (s.equals(""))
			return 0;
		Stack<Character> symbol = new Stack<Character>();
		Stack<Integer> nums = new Stack<Integer>();
		boolean isPriority = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				continue;
			} else if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				String num = s.charAt(i) + "";
				while (i + 1 < s.length()
						&& (s.charAt(i + 1) == ' ' || (s.charAt(i + 1) >= 48 && s.charAt(i + 1) <= 57))) {
					if (s.charAt(i + 1) == ' ') {
						i++;
						continue;
					}
					num = num + s.charAt(++i);
				}
				int number = Integer.parseInt(num);
				nums.push(number);
				if (isPriority) {
					int num1 = nums.pop();
					int num2 = nums.pop();
					char sym = symbol.pop();
					if (sym == '*') {
						nums.push(num1 * num2);
					} else {
						nums.push(num2 / num1);
					}
					isPriority = false;
				}
			} else {
				symbol.push(s.charAt(i));
				if (s.charAt(i) == '*' || s.charAt(i) == '/') {
					isPriority = true;
				} else
					isPriority = false;
			}

		}
		while (!symbol.isEmpty()) {
			int num1 = nums.pop();
			int num2 = nums.pop();
			char sym = symbol.pop();
			if (!symbol.isEmpty()) {
				char sym2 = symbol.peek();
				if (sym2 == '-') {
					num2 = -1 * num2;
					symbol.pop();
					symbol.push('+');
				}
			}

			if (sym == '+') {
				nums.push(num1 + num2);
			} else {
				nums.push(num2 - num1);
			}
		}
		return nums.peek();
	}
}
