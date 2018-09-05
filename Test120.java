import java.util.Arrays;
import java.util.List;

public class Test120 {
	public int minimumTotal(List<List<Integer>> triangle) {
		int[][] temp = new int[triangle.size()][triangle.get(triangle.size() - 1).size()];
		temp[0][0] = triangle.get(0).get(0);
		for (int i = 1; i < triangle.size(); i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0)
					temp[i][j] = temp[i - 1][j] + triangle.get(i).get(j);
				else if (j == i)
					temp[i][j] = temp[i - 1][j - 1] + triangle.get(i).get(j);
				else
					temp[i][j] = Math.min(temp[i - 1][j - 1], temp[i - 1][j]) + triangle.get(i).get(j);
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
		int rs = Integer.MAX_VALUE;
		for(int i = 0;i<triangle.get(triangle.size()-1).size();i++) {
			if(triangle.get(triangle.size()-1).get(i)<rs)rs = triangle.get(triangle.size()-1).get(i);
		}
		return rs;
	}
}
