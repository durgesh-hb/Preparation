package questions.recursion;

public class practice_problems {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fibonacci(12));;
		
	}
	
	static void	 fun1(int n) {
		
		if(n == 0) {
			return ;
		}
		
		System.out.println(n);
		
		fun1(n-1);
	}

    static void fun2(int n) {
		
		if(n == 0) {
			return;
		}
		
		fun2(n-1);
		System.out.println(n);
		
	}
	
	static int sum(int n) {
		
		if(n == 0) {
			return 0;
		}
		
		return n + sum(n-1);
		
	}

    static int factorial(int n) {
		
		if(n == 0) {
			return 0;
		}
		
		return n * factorial(n-1);
	}

	static int sumdigit(int n) {
		
		if(n == 0) {
			return 0;
		}
		
		return (n%10) + sumdigit(n / 10);
		
	}

	static int countdigit(int n) {
		
		if(n <= 0) {
			return 0;
		}
		
		return 1 + countdigit(n / 10);
		
	}

	static int fibonacci(int n) {
		
		if( n <= 1) {
			return n; // for fib(1) gives = 1, and fib(0) gives = 0
		}			  // fib(1) + fib(0)
		
		return fibonacci(n-1) + fibonacci(n - 2);
	}
}
