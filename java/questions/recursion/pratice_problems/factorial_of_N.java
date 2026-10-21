package questions.recursion.pratice_problems;

public class factorial_of_N {

    // Repeated calculations
    // Each call creates more calls, and the same Fibonacci values are calculated repeatedly.
    // time o(2n) 
    // spcae o(n) 
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        
        return n * factorial(n - 1);
    }


    // No repeated calculations
    // It calculates each Fibonacci number once and keeps only the previous two values.
    // optimized code 
    // time o(n)
    // space o(1)
    static public int fib(int n) {

        if(n <= 1){
            return n;
        }

       int prev0 = 0;
       int prev1 = 1;

       for(int i=2; i<=n; i++){

            int temp = prev0 + prev1;
            prev0 = prev1;
            prev1 = temp;

       }
        return prev1;
    }
}
