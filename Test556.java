import java.util.Arrays;

public class Test556 {
	public int nextGreaterElement(int n) {
		// System.out.println(Integer.parseInt("2147483649"));
		if (n < 10)
			return -1;
		String num = n + "";
		int pos = num.length() - 2;
		while (pos >= 0 && num.charAt(pos) >= num.charAt(pos + 1)) {
			pos--;
		}
		if (pos == -1)
			return -1;
		int i = num.length() - 1;
		for (; i > pos; i--) {
			if (num.charAt(i) > num.charAt(pos))
				break;
		}
		char next = num.charAt(i);

		char[] temp = new char[num.length() - pos - 1];
		// System.out.println(temp.length);
		boolean passed = false;
		for (int j = 0; j < temp.length; j++) {
			if (!passed && pos + j == i) {
				passed = true;
				j--;
				continue;
			}
			if (!passed)
				temp[j] = num.charAt(pos + j);
			else {
				temp[j] = num.charAt(pos + j + 1);
			}

		}

		Arrays.sort(temp);

		num = num.substring(0, pos);
		num = num + next;
		for (int j = 0; j < temp.length; j++) {
			num = num + temp[j];
		}
		try {
			return Integer.parseInt(num);
		} catch (Exception e) {
			return -1;
		}

	}
}
