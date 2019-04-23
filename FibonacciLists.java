import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FibonacciLists {

	public int fibList(int n) {
		List<Integer> fibonacciNumbers = new ArrayList<Integer>();
		fibonacciNumbers.add(0);
		fibonacciNumbers.add(1);
		for (int i = 2; i < n; i++) {
			fibonacciNumbers.add(fibonacciNumbers.get(i-1) + fibonacciNumbers.get(i-2));
		}
		return fibonacciNumbers.get(n-1);
		
}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		FibonacciLists fib = new FibonacciLists();
		System.out.println(fib.fibList(n));
		s.close();

	}

}
