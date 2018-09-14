import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Test253 {
	public int minMeetingRooms(Interval[] intervals) {
		if (intervals.length == 0)
			return 0;
		Arrays.sort(intervals, new Comparator<Interval>() {
			public int compare(Interval a, Interval b) {
				if (a.start != b.start) {
					return a.start - b.start;
				} else {
					return a.end - b.end;
				}
			}
		});
		PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
		minheap.add(intervals[0].end);
		for (int i = 1; i < intervals.length; i++) {
			if (intervals[i].start >= minheap.peek()) {
				minheap.poll();
				minheap.add(intervals[i].end);
			} else {
				minheap.add(intervals[i].end);
			}
		}

		return minheap.size();
	}
}
