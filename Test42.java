
public class Test42 {
	public static int trap(int[] height) {
		int rs = 0;
		if(height.length <=1)return 0;
		int i = 0;
		for (i = 0; i < height.length; i++) {
			if (height[i] != 0)
				break;
		}
		rs = value(height, rs, i, height.length, height[i]);
		return rs;
	}

	private static int value(int[] height, int rs, int from, int end, int top) {
		if (end - from <= 2)
			return rs;
		int maxlow = -1, minlow = top;
		for (int i = from; i < end; i++) {
			if (height[i] < top) {
				if (height[i] < minlow)
					minlow = height[i];
				if (height[i] > maxlow)
					maxlow = height[i];
			}
			if (height[i] >= top && minlow <= maxlow) {
				rs += (i - from - 1) * (top - maxlow);
				if (minlow < maxlow) {
					rs = value(height, rs, from + 1, i, height[from + 1]);
				}
				from = i;
				top = height[i];

			} else if (height[i] >= top && minlow > maxlow) {
				from = i;
				top = height[i];
			} else if (i == end - 1) {
				rs = value2(height, rs, end-1, from, height[end- 1]);
			}
		}
		return rs;
	}
	private static int value2(int[] height, int rs, int from, int end, int top) {
//		if (from - end <= 2)
//			return rs;
		int maxlow = -1, minlow = top;
		for (int i = from; i >= end; i--) {
			if (height[i] < top) {
				if (height[i] < minlow)
					minlow = height[i];
				if (height[i] > maxlow)
					maxlow = height[i];
			}
			if (height[i] >= top && minlow <= maxlow) {
				rs += (from-i - 1) * (top - maxlow);
				if (minlow < maxlow) {
					rs = value2(height, rs, from - 1, i, height[from - 1]);
				}
				from = i;
				top = height[i];

			} else if (height[i] >= top && minlow > maxlow) {
				from = i;
				top = height[i];
			} 
		}
		return rs;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {2,1,0,2};
		System.out.println(trap(height));
	}

}
