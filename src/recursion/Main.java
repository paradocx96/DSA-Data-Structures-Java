package recursion;

public class Main {

	public static void main(String[] args) {

		System.out.println(pow(2, 3));
	}
	
	
	public static int pow(int x, int n) {
		if (n == 0) {
			return 1;
		} else {
			return (x * pow(x, n-1));
		}
	}

}
