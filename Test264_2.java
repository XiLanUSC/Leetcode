
public class Test264_2 {
	public int nthUglyNumber(int n) {
		int i2 = 0,i3=0,i5=0;
		int[] ugly = new int[n];
		ugly[0] = 1;
		for(int i = 1;i<n;i++) {
			ugly[i] = Math.min(ugly[i2]*2, Math.min(ugly[i3]*3, ugly[i5]*5));
			if(ugly[i] == ugly[i2]*2)i2++;
			if(ugly[i] == ugly[i3]*3)i3++;
			if(ugly[i] == ugly[i5]*5)i5++;
		}
		
		
		return ugly[n-1];
	}
}
