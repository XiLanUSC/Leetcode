import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test127 {
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		Queue<Pair> queue = new LinkedList<Pair>();
		boolean[] isVisited = new boolean[wordList.size()];
		for (int i = 0; i < isVisited.length; i++)
			isVisited[i] = false;
		Pair p = new Pair();
		p.setWord(beginWord);
		p.setCount(1);
		queue.add(p);
		isVisited[wordList.indexOf(beginWord)] = true;
		while (!queue.isEmpty()) {
			Pair temp = queue.poll();
			for (int i = 0; i < wordList.size(); i++) {
				if (isVisited[i])
					continue;
				String s = wordList.get(i);
				if (isNear(temp.getWord(), s)) {
					if (s.equals(endWord)) {
						return temp.getCount() + 1;
					}
					Pair newPair = new Pair();
					newPair.setWord(s);
					newPair.setCount(temp.getCount() + 1);
					queue.add(newPair);
					isVisited[i] = true;
				}
			}
		}
		return 0;
	}

	private boolean isNear(String begin, String end) {
		int count = 0;
		char[] begin1 = begin.toCharArray();
		char[] end1 = end.toCharArray();
		for (int i = 0; i < begin1.length; i++) {
			if (begin1[i] != end1[i])
				count++;
			if (count > 1)
				return false;
		}
		return true;
	}

	private class Pair {
		private String word;
		private int count;

		public String getWord() {
			return word;
		}

		public void setWord(String word) {
			this.word = word;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

	}
}
