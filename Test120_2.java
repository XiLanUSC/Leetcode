import java.util.Arrays;
import java.util.List;

public class Test120_2 {
	public int minimumTotal(List<List<Integer>> triangle) {
		if (triangle.size() == 1)
			return triangle.get(0).get(0);
		int[][] temp = new int[2][triangle.get(triangle.size() - 1).size()];
		temp[0][0] = triangle.get(0).get(0);
		for (int i = 1; i < triangle.size(); i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0)
					temp[1][j] = temp[0][j] + triangle.get(i).get(j);
				else if (j == i)
					temp[1][j] = temp[0][j - 1] + triangle.get(i).get(j);
				else
					temp[1][j] = Math.min(temp[0][j - 1], temp[0][j]) + triangle.get(i).get(j);
				System.out.print(temp[1][j] + " ");
			}
			for (int j = 0; j <= i; j++) {
				temp[0][j] = temp[1][j];
			}
			System.out.println();
		}
		Arrays.sort(temp[1]);
		return temp[1][0];
	}
}
