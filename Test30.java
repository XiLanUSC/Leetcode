import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test30 {
	public static List<Integer> findSubstring(String s, String[] words) {
		List<Integer> rs = new ArrayList();
		if(words.length ==0)return rs;
		List<String> addWords = new ArrayList();
		create(addWords, Arrays.asList(words), "");

		int len = addWords.get(0).length();
		for (int i = 0; i < s.length() - len+1; i++) {
			for (int j = 0; j < addWords.size(); j++) {
				if (s.substring(i, i + len).equals(addWords.get(j))) {
					rs.add(i);
					//System.out.println(i);
					break;
				}
			}

		}

		return rs;
	}

	private static void create(List<String> rs, List<String> ss, String words) {
		if (ss.isEmpty()) {
			//System.out.println(words);
			rs.add(words);
		}
		for (int i = 0; i < ss.size();i++) {
			List<String> temp = new ArrayList(ss);
			create(rs, temp, words + temp.remove(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		"wordgoodgoodgoodbestword"
//		["word","good","best","good"]
		String s= "wordgoodgoodgoodbestword";
		String[] ss = {"word","good","best","good"};
		findSubstring(s,ss);
	}

}
