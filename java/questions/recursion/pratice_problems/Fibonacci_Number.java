package questions.recursion.pratice_problems;

public class Fibonacci_Number {

    public static void main(String[] args) {
        
    }


     // Repeated calculations
    // Each call creates more calls, and the same Fibonacci values are calculated repeatedly.
    // time o(2n) 
    // spcae o(n) 

    public static int fib(int n) {

        if(n <= 1){
            return n;
        }

        return fib(n-1) + fib(n-2);
        
    }
    // No repeated calculations
    // It calculates each Fibonacci number once and keeps only the previous two values.
    // optimized code 
    // time o(n)
    // space o(1)
    static public int fibopti(int n) { //used DP

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
