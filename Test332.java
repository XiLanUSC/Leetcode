import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test332 {
	public List<String> findItinerary(String[][] tickets) {
		List<String> rs = new ArrayList();
		String now = "JFK";
		rs.add("JFK");
		int temp = -1;
		boolean[] reached = new boolean[tickets.length];
		Arrays.fill(reached, false);
		for (int i = 0; i < tickets.length; i++) {
			temp = -1;
			for (int j = 0; j < tickets.length; j++) {
				if (reached[j] == true)
					continue;
				if (tickets[j][0] == now) {
					if (temp == -1)
						temp = j;
					else {
						char[] a = tickets[j][1].toCharArray();
						char[] b = tickets[temp][1].toCharArray();
						for (int k = 0; k < a.length; k++) {
							if (a[k] < b[k])
								temp = j;
						}
					}
				}
			}
			reached[temp] = true;
			rs.add(tickets[temp][1]);
			now = tickets[temp][1];
		}
		return rs;
	}
}
