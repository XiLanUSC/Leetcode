import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test518 {
	public int change(int amount, int[] coins) {
		List<Integer> list = new ArrayList();
		
		if (amount == 0)
			return 1;
		Arrays.sort(coins);
		int[] dp = new int[amount + 1];
		dp[0] = 1;

		for (int j = 0; j < coins.length; j++) {
			for (int i = 1; i <= amount; i++) {
				if (i >= coins[j]) {
					dp[i] += dp[i - coins[j]];
				}

			}
		}
		for (int i = 0; i <= amount; i++)
			System.out.println(dp[i]);
		return dp[amount];
	}
}
