import java.util.Comparator;
import java.util.List;

public class Test139 {
	public boolean wordBreak(String s, List<String> wordDict) {
		if (s.length() == 0)
			return true;
		wordDict.sort(new Comparator<String>() {

			public int compare(String a1, String a2) {
				// TODO Auto-generated method stub
				if (a1.length() > a2.length()) {
					return -1;
				} else if (a1.length() < a2.length()) {
					return 1;
				} else {
					return 0;
				}

			}

		});
		return get(s,wordDict);
	}
	private boolean get(String s,List<String> wordDict) {
		for (String word : wordDict) {
			if (s.length() >= word.length() && word.equals(s.substring(0, word.length()))) {
				if (s.length() == word.length()
						|| (s.length() > word.length() && get(s.substring(word.length(), s.length()), wordDict)))
					return true;
			}
		}
		return false;
	}
}
