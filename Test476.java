
public class Test476 {
	public int findComplement(int num) {
		int n = 0;
		while(Math.pow(2, n)-1<num) {
			n++;
		}
		return (int)(Math.pow(2, n)-1-num);
	}
	
}
