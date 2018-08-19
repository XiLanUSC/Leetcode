import java.util.ArrayList;
import java.util.List;

public class Test51 {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> rs = new ArrayList();
		if(matrix.length == 0)return rs;
		int[][] direction = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		int way_choose = 0;
		int xr = matrix[0].length;
		int xl = -1;
		int top = -1;
		int bottom = matrix.length;
		int i = 0, j = 0;
		for (int m = 0; m < matrix.length * matrix[0].length; m++) {
			rs.add(matrix[i][j]);
			i += direction[way_choose][0];
			j += direction[way_choose][1];

			if (j >= xr) {
				j--;
				i++;
				way_choose = (++way_choose) % 4;
				top++;
			}
			if (j <= xl) {
				j++;
				i--;
				way_choose = (++way_choose) % 4;
				bottom--;
			}
			if (i >= bottom) {
				i--;
				j--;
				way_choose = (++way_choose) % 4;
				xr--;
			}
			if (i <= top) {
				i++;
				j++;
				way_choose = (++way_choose) % 4;
				xl++;
			}
		}
		return rs;
	}
}
