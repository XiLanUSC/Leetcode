import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Test179 {
	public String largestNumber(int[] nums) {
		if (nums.length == 0)
			return "0";
		String rs = "";
		HashMap<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			String temp = nums[i] + "";
			if (map.containsKey(temp.charAt(0) + "")) {
				List<String> list = map.get(temp.charAt(0) + "");
				list.add(temp);
				map.put(temp.charAt(0) + "", list);
			} else {
				List<String> list = new ArrayList();
				list.add(temp);
				map.put(temp.charAt(0) + "", list);
			}
		}
		for (int i = 9; i >= 0; i--) {
			if (!map.containsKey(i + "")) {
				continue;
			}
			List<String> temp = map.get(i + "");
			temp.sort(new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					// TODO Auto-generated method stub
					boolean changed = false;
					if (o2.length() < o1.length()) {
						String temp = o1;
						o1 = o2;
						o2 = temp;
						changed = true;
					}
					int len = o1.length();
					int i = 0;
					while (i < len) {
						if (o1.charAt(i) > o2.charAt(i))
							return !changed ? -1 : 1;
						else if (o1.charAt(i) < o2.charAt(i))
							return !changed ? 1 : -1;
						i++;
					}
					if (o2.length() == o1.length())
						return 1;
					if (o2.charAt(i) > o1.charAt(0)) {
						return !changed ? 1 : -1;
					} else {
						return !changed ? -1 : 1;
					}
				}
			});
			if (i == 0) {
				if (rs.equals(""))
					rs = "0";
				else {
					for (String s : temp) {
						rs = rs + s;
					}
				}
			} else {
				for (String s : temp) {
					rs = rs + s;
				}
			}

		}
		return rs;
	}

	// return true if a>b(in the question background)
	private int compare(String a, String b) {
		int len = Math.min(a.length(), b.length());
		int i = 0;
		while (i < len) {
			if (a.charAt(i) > b.charAt(i))
				return 1;
			else if (a.charAt(i) < b.charAt(i))
				return -1;
			i++;
		}
		if (a.length() < b.length())
			return -1;
		return 1;
	}
}
