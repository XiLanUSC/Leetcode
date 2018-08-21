
public class Test62 {
	public int uniquePaths(int m, int n) {
		int rs = 0;
		int upper = 1,lower = 1;
		upper = multi(m+n-2);
		lower = multi(m-1)*multi(n-1);
		rs = upper/lower;
		return rs;
	}
	private static int multi(int n) {
		int rs = 1;
		for (int i = 1; i <= n; i++) {
			rs *= i;
		}
		return rs;
	}
}
