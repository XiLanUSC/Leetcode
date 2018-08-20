import java.util.ArrayList;
import java.util.List;

public class Test60 {
	public static String getPermutation(int n, int k) {
		String rs = "";
		List<Integer> nums = new ArrayList();
		List<Integer> temp = new ArrayList();
		for (int i = 0; i < n; i++) {
			nums.add(i + 1);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < nums.size(); j++) {
				if (k > j*multi(n - i - 1) && k <= (j+1)*multi(n - i-1)) {
					System.out.println(multi(n - i - 1)+" "+k+" "+multi(n - i)+" "+n+" "+i+" "+j);
					temp.add(nums.get(j));
					nums.remove(j);
					k-=j*multi(n-i-1);
				}
			}
		}
		for(int i :temp)
			rs = rs+""+i;
		return rs;
	}

	private static int multi(int n) {
		int rs = 1;
		for (int i = 1; i <= n; i++) {
			rs *= i;
		}
		return rs;
	}
	public static void main(String args[]) {
		System.out.println(getPermutation(3,3));
	}
}
