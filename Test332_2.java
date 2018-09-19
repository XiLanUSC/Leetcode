import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Test332_2 {
	HashMap<String, List<String>> map;
	int len;

	public List<String> findItinerary(String[][] tickets) {
		map = new HashMap<>();
		List<String> rs = new ArrayList();
		len = tickets.length + 1;

		init(tickets);
		rs.add("JFK");
		dfs(rs);

		return rs;
	}

	private boolean dfs(List<String> rs) {
		if (rs.size() == len)
			return true;

		String cur = rs.get(rs.size() - 1);
		List<String> temp = map.get(cur);

		if (temp == null) {
			return false;
		}

		for (int i = 0; i < temp.size(); i++) {
			String s = temp.get(i);
			rs.add(s);
			temp.remove(i);
			if (dfs(rs))
				return true;

			temp.add(i, s);
			rs.remove(rs.size() - 1);

		}

		return false;
	}

	private void init(String[][] tickets) {
		for (String[] temp : tickets) {
			String from = temp[0];
			String to = temp[1];

			if (!map.containsKey(from)) {
				map.put(from, new LinkedList<String>());

			}
			List<String> list = map.get(from);
			int i = 0;
			while (i < list.size()) {
				String cur = list.get(i);
				if (cur.compareTo(to) > 0) {
					break;
				}
				i++;
			}
			list.add(i, to);
		}
	}
}
