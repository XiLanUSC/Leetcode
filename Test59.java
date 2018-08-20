import java.util.ArrayList;
import java.util.List;

public class Test59 {
	public int[][] generateMatrix(int n) {
		int[][] rs = new int[n][n];
		// List<Integer> rs = new ArrayList();
		// if(matrix.length == 0)return rs;
		int[][] direction = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		int way_choose = 0;
		int xr = n;
		int xl = -1;
		int top = -1;
		int bottom = n;
		int i = 0, j = 0;
		for (int m = 0; m < n * n; m++) {
			rs[i][j] = m + 1;
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
