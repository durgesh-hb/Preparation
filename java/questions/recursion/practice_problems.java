package questions.recursion;

public class practice_problems {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		fun1(5);
		
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
	
	static int fun3(int n) {
		
		if(n == 0) {
			return 0;
		}
		
		return n + fun3(n-1);
		
	}
}
