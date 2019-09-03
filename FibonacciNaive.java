import java.util.Scanner;
import java.util.Arrays;
public class FibonacciNaive {
	
	public int naiveFibonacci(int n) {
		if (n <= 1) {
			return n;
		}else {
			return naiveFibonacci(n-1) + naiveFibonacci(n-2);
		}
	}
	
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		FibonacciNaive fib = new FibonacciNaive();
		fib.naiveFibonacci(n);
		in.close();
	}

}
