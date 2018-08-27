
public class Test88 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int count = 0, counti = 0, countj = 0;
		int i = 0, j = 0;
		while (count < m + n) {
			if (counti == m) {
				nums1[i] = nums2[j];
				i++;
				j++;
				countj++;
				count++;
			} else if (countj == n) {
				break;
			} else if (nums1[i] <= nums2[j]) {
				count++;
				counti++;
				i++;
				continue;
			} else {
				for (int k = m + j - 1; k >= i; k--) {
					nums1[k + 1] = nums1[k];
				}
				nums1[i] = nums2[j];
				j++;
				i++;
				count++;
				countj++;
			}
		}
	}
}
