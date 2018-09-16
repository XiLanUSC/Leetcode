
public class Test277 {
	boolean knows(int a, int b) {
		return false;
	}

	public int findCelebrity(int n) {
		int theperson = 0;
		for(int i = 1;i<n;i++) {
			if(knows(theperson,i))
				theperson = i;
		}
		for(int i = 0;i<theperson;i++) {
			if(i!=theperson&&(knows(theperson,i)||!knows(i,theperson)))return -1;
			
		}
		return theperson;
	}
	
}
