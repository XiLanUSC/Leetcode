
public class Test7 {
	public static int reverse(int x) {
		int result = 0;
		
		while (x != 0) {
			int temp = x % 10;
			if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && temp > 7)) return 0;
			if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 && temp < -8)) return 0;
			result = result*10+temp;
			x /= 10;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1463847413;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(reverse(x));
	}

}
