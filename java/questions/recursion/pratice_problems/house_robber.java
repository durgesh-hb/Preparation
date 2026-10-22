package questions.recursion.pratice_problems;

import java.util.Arrays;

public class house_robber {

    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);

        return solve(nums.length - 1, nums, dp);
    }

    public int solve(int i, int[] nums, int[] dp) {
        // base case
        if (i < 0) {
            return 0;
        }

        if (i == 0) {
            return nums[0];
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        // cuurent count
        int rob = nums[i] + solve(i - 2, nums, dp);
        // skip the current and count
        int skip = solve(i - 1, nums, dp);

        dp[i] = Math.max(rob, skip);

        return dp[i];
    }
    
}
