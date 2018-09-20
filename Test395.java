
public class Test395 {
	public int longestSubstring(String s, int k) {
		int result = 0;
		int[] count = new int[26];

		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
		}
		boolean allPass = true;
		for (int i = 0; i < 26; i++) {
			if (count[i] < k && count[i] > 0)
				allPass = false;
		}
		if (allPass)
			return s.length();
		int start = 0, cur = 0;
		while (cur < s.length()) {
			if (count[s.charAt(cur) - 'a'] < k && count[s.charAt(cur) - 'a'] > 0) {
				result = Math.max(result, longestSubstring(s.substring(start, cur), k));
				start = cur + 1;
			}
			cur++;
		}
		result = Math.max(result, longestSubstring(s.substring(start, cur), k));
		return result;
	}
}
