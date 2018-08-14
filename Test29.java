
public class Test29 {
	public static int divide(int dividend, int divisor) {
		int rs = 0;
		//System.out.println(1);
		if (dividend == Integer.MIN_VALUE && divisor == -1) {
			System.out.println(divisor);
			return Integer.MAX_VALUE;
		}
		long a = Math.abs((long)dividend);
		//System.out.println(a);
		long b = Math.abs((long)divisor);
		long sum = 0;
		int temp = 0;
		while (b <= a) {
			int count = 1;
			sum = b;
			while (sum + sum <= a) {
				sum += sum;
				count += count;
			}
			rs+=count;
			a-=sum;
		}
		if((dividend<0&&divisor>0)||(dividend>0&&divisor<0)) {
			rs = -rs;
		}
		return rs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//divide(-2147483648,1);
		System.out.println(divide(-2147483648,1));
	}

}
