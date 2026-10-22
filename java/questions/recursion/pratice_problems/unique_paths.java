package questions.recursion.pratice_problems;

public class unique_paths {

    public static void main(String[] args) {
        
    }

    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];

        return countpath(m-1, n-1, dp);
        
    }

    int countpath(int row, int cal, int[][] dp){

        if(row == 0 || cal ==0 ){
            return 1;
        }

        if(dp[row][cal] != 0){ // use the ans is calculated and stored
            return dp[row][cal];
        }

        // if not calculated before calculate and stored it
        dp[row][cal] = countpath(row-1, cal, dp) + countpath(row, cal-1, dp);

        return dp[row][cal];

    }
    
}
