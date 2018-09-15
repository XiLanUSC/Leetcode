import java.util.ArrayList;
import java.util.List;

public class Test264 {
	public int nthUglyNumber(int n) {
		if (n <= 5)
			return n;
		List<Integer> ugly = new ArrayList();
		int count = 6;
		ugly.add(1);
		ugly.add(2);
		ugly.add(3);
		ugly.add(4);
		ugly.add(5);
		for (int i = 6; i <= n;) {
			if (count % 2 == 0) {
				if (ugly.contains(count / 2)) {
					ugly.add(count);
					i++;
				}

			} else if (count % 3 == 0) {
				if (ugly.contains(count / 3)) {
					ugly.add(count);
					i++;
				}
			} else if (count % 5 == 0) {
				if (ugly.contains(count / 5)) {
					ugly.add(count);
					i++;
				}
			}
			count++;
		}
		return ugly.get(ugly.size()-1);

	}
}
