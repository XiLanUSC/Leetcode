
public class Test50 {
	public static double myPow(double x, int n) {
		if (n == 0)
			return 1;
		if (n < 0) {
			x = 1 / x;
			n = -n;
		}
		if(n == Integer.MIN_VALUE)return  myPow(x * x, -(n / 2));
		return (n % 2 == 1) ? (x * myPow(x * x, n / 2)) : myPow(x * x, n / 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myPow(2.00000,-2147483648));
	}

}
