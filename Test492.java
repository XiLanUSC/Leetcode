
public class Test492 {
	public int[] constructRectangle(int area) {
		int[] rs = new int[2];
		rs[0] = area;
		rs[1] = 1;
		
		int i = area-1,j = 2;
		while(i>=j) {
			if(i*j == area) {
				rs[0] = i;
				rs[1] = j;
				i--;
				j++;
			}else if(i*j>area) {
				i--;
			}else {
				j++;
			}
		}
		
		return rs;
	}
}
