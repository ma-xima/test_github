package rekursion;

public class BinomialCoefficient {
	
	public static int bC(int n, int c) {
		if(c == 0 || c == n) {
			return 1;
		} else {
			return bC(n-1,c-1) + bC(n-1,c);
		}
	}

	public static void main(String[] args) {
		System.out.println(bC(4,2)); 

	}

}
 