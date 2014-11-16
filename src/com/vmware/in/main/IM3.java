package intermediate.tutorials;

public class IM3 {

	public static void main(String[] args) {
		System.out.println(fact(3));
		System.out.println(fact(5));
		System.out.println(fact(10));
	}

	private static int fact(int n) {
		if(n <= 1) {
			return 1;
		} else {
			return n * fact(n-1);
		}
	}
}
