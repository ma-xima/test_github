package rekursion;

public class SumNaturalNumbers {
	
	public static int recursiveSum(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n + recursiveSum(n-1);
		}
		}

	public static void main(String[] args) {
		System.out.println(recursiveSum(5)+ recursiveSum(6));
		

	}

}
