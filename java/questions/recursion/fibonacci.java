package questions.recursion;

public class fibonacci {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fibonacci(30));
		
	}
	
	static int fibonacci(int n) {
		
		if( n <= 1) {
			return n; // for fib(1) gives = 1, and fib(0) gives = 0
		}			  // fib(1) + fib(0)
		
		return fibonacci(n-1) + fibonacci(n - 2);
	}
}
