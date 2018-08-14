import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test30_2 {
	public static List<Integer> findSubstring(String s, String[] words) {
		List<Integer> rs = new ArrayList();
		if (words.length == 0)
			return rs;
		HashMap<String, Integer> hm = getHashMap(words);
		//System.out.println(hm);
		int wordslen = words.length, count = wordslen, singleWordLen = words[0].length();
		boolean changed = false;

		for (int i = 0; i < s.length() - singleWordLen * words.length + 1; i++) {
			String temp = s.substring(i, i + singleWordLen);
			int tempi = i;
			while (hm.containsKey(temp) && (int) hm.get(temp) != 0 && count > 0) {
				//System.out.println(i+" "+tempi+" "+temp);
				hm.replace(temp, ((int) hm.get(temp)) - 1);
				count--;
				changed = true;
				if(count == 0)break;
				tempi += singleWordLen;
				temp = s.substring(tempi, tempi + singleWordLen);

			}
			if (count == 0) {
				rs.add(i);
				//System.out.println(i);
			}
				
			if (changed) {
				hm = getHashMap(words);
				changed = false;
				count = wordslen;
			}
		}
		return rs;
	}

	private static HashMap<String, Integer> getHashMap(String[] words) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 0; i < words.length; i++) {
			if (hm.containsKey(words[i])) {
				hm.replace(words[i], ((int) hm.get(words[i])) + 1);
			} else {
				hm.put(words[i], 1);
			}
		}
		return hm;
	}

	public static void main(String[] args) {
		String s= "wordgoodgoodgoodbestword";
		String[] ss = {"word","good","best","good"};
		findSubstring(s,ss);
	}

}
