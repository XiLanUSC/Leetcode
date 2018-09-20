import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test336 {
	public List<List<Integer>> palindromePairs(String[] words) {
		List<List<Integer>> rs = new ArrayList<>();
		if (words.length == 0)
			return rs;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < words.length; i++) {
			map.put(words[i], i);
		}
		if (map.containsKey("")) {
			int pos = map.get("");
			for (int i = 0; i < words.length; i++) {
				if (isPalindrome(words[i])) {
					if (i == pos)
						continue;
					rs.add(Arrays.asList(pos, i));
					rs.add(Arrays.asList(i, pos));
				}
			}
		}
		for (int i = 0; i < words.length; i++) {
			String cur = words[i];
			if (map.containsKey(reverseString(cur))) {
				int pos = map.get(reverseString(cur));
				if (pos != i) {
					rs.add(Arrays.asList(pos, i));
					// rs.add(Arrays.asList(i,pos));
				}

			}
		}
		for (int i = 0; i < words.length; i++) {
			String cur = words[i];
			for (int cut = 1; cut < cur.length(); cut++) {
				if (isPalindrome(cur.substring(0, cut))) {
					if (map.containsKey(reverseString(cur.substring(cut)))) {
						int pos = map.get(reverseString(cur.substring(cut)));
						if (pos != i)
							rs.add(Arrays.asList(pos, i));
					}
				}
				if (isPalindrome(cur.substring(cut))) {
					if (map.containsKey(reverseString(cur.substring(0, cut)))) {
						int pos = map.get(reverseString(cur.substring(0, cut)));
						if (pos != i)
							rs.add(Arrays.asList(i, pos));
					}
				}
			}
		}
		return rs;
	}

	private boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	private String reverseString(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
}
