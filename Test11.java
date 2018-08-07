
public class Test11 {
	public int maxArea(int[] height) {
		int result = 0;
		int i = 0, j = height.length - 1;
		while (i < j) {
			int h = 0, temp = 0;
			if (height[j] > height[i]) {
				h = height[i];
				temp = i;
			} else {
				h = height[j];
				temp = j;
			}
			// int h = Math.min(height[i], height[j]);
			int area = (j - i) * h;
			if (area > result)
				result = area;
			if (temp == j)
				j--;
			else
				i++;
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {};
	}

}
