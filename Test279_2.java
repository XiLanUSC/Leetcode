import java.util.Arrays;

public class Test279_2 {
	public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for(int i = 0; i * i <= n; i++) 
            dp[i * i] = 1;
        for(int i = 1; i <= n; i++) {  //ѡ����һ����Ϊ i
            for(int j = 1; i + j * j <= n; j++) {  //ѡ����һ����Ϊ j*j
                dp[i + j * j] = Math.min(dp[i] + 1, dp[i + j * j]);  //��С�������
            }
        }
        return dp[n];
    }

}
