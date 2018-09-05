import java.util.Arrays;
import java.util.List;

public class Test120_3 {
	public int minimumTotal(List<List<Integer>> triangle) {

		for (int i = 1; i < triangle.size(); i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0)
					triangle.get(i).set(j, triangle.get(i - 1).get(j) + triangle.get(i).get(j));
				else if (j == i)
					triangle.get(i).set(j, triangle.get(i - 1).get(j - 1) + triangle.get(i).get(j));
				else {
					triangle.get(i).set(j, Math.min(triangle.get(i - 1).get(j - 1), triangle.get(i - 1).get(j))
							+ triangle.get(i).get(j));
				}
			}
		}
		Arrays.sort(triangle.get(triangle.size() - 1).toArray());

		return triangle.get(triangle.size() - 1).get(0);
	}
}
