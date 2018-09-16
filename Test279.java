//Time Limit Exceeded
public class Test279 {
	public int numSquares(int n) {
		int[] dp = new int[n+1];
		dp[1] = 1;
        
		for (int i = 2; i <= n; i++) {
			if (i == (int)Math.sqrt(i) * (int)Math.sqrt(i)) {
                System.out.println(i);
				dp[i] = 1;
				continue;
			}

			int min = dp[i - 1] + 1;
			for (int j = 1; j <= i/2; j++) {
				if (dp[j] + dp[i - j ] < min)
					min = dp[j] + dp[i - j];
			}
			dp[i] = min;
		}
        for(int i  =1;i<=n;i++){
            System.out.println((i)+" "+dp[i]);
        }
		return dp[n];
	}
	public static void main(String args[]) {
		System.out.println(Math.sqrt(11));
	}
}
