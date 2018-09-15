
public class Test258 {
	public int addDigits(int num) {
		int rs = 0;
		while(num>=10) {
			rs = 0;
			while(num>0) {
				rs+=num%10;
				num/=10;
			}
			num = rs;
		}
		return num;
	}
}
