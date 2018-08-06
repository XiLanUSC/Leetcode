
public class Test4_2 {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double rs = 0.0;
		int m = nums1.length;
		int n = nums2.length;
		if (m > n) { // to ensure m<=n
			int[] temp = nums1;
			nums1 = nums2;
			nums2 = temp;
			int tmp = m;
			m = n;
			n = tmp;
		}
		int imin = 0, imax = m, mediumlen = (m + n + 1) / 2;
		while (imin <= imax) {
			int i = (imin + imax) / 2;
			int j = mediumlen - i;
			if (i < imax && nums2[j - 1] > nums1[i]) {
				imin = imin + 1; // i is too small
			} else if (i > imin && nums1[i - 1] > nums2[j]) {
				imax = imax - 1; // i is too big
			} else {
				int maxleft = 0;
				if (i == 0)
					maxleft = nums2[j - 1];
				else if (j == 0)
					maxleft = nums1[i - 1];
				else {
					maxleft = Math.max(nums1[i - 1], nums2[j - 1]);
				}
				if ((m + n) % 2 == 1)
					return maxleft;

				int minright = 0;
				if (i == m)
					minright = nums2[j];
				else if (j == n)
					minright = nums1[i];
				else {
					minright = Math.min(nums1[i], nums2[j]);
				}
				if ((m + n) % 2 == 0)
					return (minright + maxleft) / 2.0;
			}
		}

		return rs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 3 };
		int[] nums2 = { 1,2 };
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}

}
