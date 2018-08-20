import java.util.ArrayList;
import java.util.List;

public class Test56 {
	public List<Interval> merge(List<Interval> intervals) {
        List<Interval> rs = new ArrayList();
        intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
		for (int i = 0; i < intervals.size(); i++) {
			Interval merge = intervals.get(i);
			for (int j = i+1; j < intervals.size();) {
                if(j == i)continue;
				Interval temp = intervals.get(j);
				if ((temp.start <= merge.end && temp.end >= merge.end)
						|| (temp.start <= merge.start && temp.end >= merge.start)
						|| (temp.start >= merge.start && temp.end <= merge.end)) {
					merge.start = Math.min(merge.start, temp.start);
					merge.end = Math.max(merge.end, temp.end);
					intervals.remove(j);
                    //if(j<i)i--;
				} else {
					j++;
				}

			}
			rs.add(merge);
		}
		return rs;
    }
}
