package questions.recursion;

public class practice_problems {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(countdigit(12345));;
		
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
}
