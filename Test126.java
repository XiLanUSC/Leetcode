import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test126 {
	public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
		int len = wordList.size();
		boolean[] visited = new boolean[len];
		Arrays.fill(visited, false);
		Set<List<String>> rs = new HashSet<>();

		return new ArrayList(rs);
	}

	private void find(Set<List<String>> rs,List<String> temp,List<String> wordList,boolean[] visited,String endWord) {
		if(temp.get(temp.size()-1).equals(endWord)) {
			if(!rs.contains(temp)) {
				rs.add(new ArrayList(temp));
			
			}
			return;
		}
		int len = wordList.size();
		for(int i = 0;i<len;i++) {
			if(!visited[i]) {
				temp.add(wordList.get(i));
				visited[i] = true;
				find(rs,temp,wordList,visited,endWord);
				visited[i] = false;
				temp.remove(temp.size()-1);
			}
		}
	}
	
	private boolean isNear(String begin, String end) {
		boolean checkedOnce = false;
		for (int i = 0; i < begin.length(); i++) {
			if (begin.charAt(i) == end.charAt(i))
				continue;
			if (!checkedOnce && begin.charAt(i) != end.charAt(i))
				checkedOnce = true;
			else
				return false;
		}
		return true;
	}
}
