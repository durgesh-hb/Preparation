package questions.recursion.pratice_problems;

public class Climbing_Stairs {

    public static void main(String[] args) {
        
    }

    // instead of calling overlapping recursion calls used the stored prev values
    public int climbStairs(int n) {

        if(n <= 2){
            return n;
        }

        int prev0 = 1;
        int prev1 = 2;

        for(int i=3; i<=n; i++){
            int temp = prev0 + prev1;
            prev0 = prev1;
            prev1 = temp;
        }
     return prev1;
    }
    
}
