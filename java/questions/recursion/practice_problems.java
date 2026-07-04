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
}
