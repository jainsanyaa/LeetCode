import java.util.Arrays;
class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(solve(0, cost), solve(1, cost));
    }
    private int solve(int i, int[] cost) {
        if (i >= cost.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int oneStep = cost[i] + solve(i + 1, cost);
        int twoStep = cost[i] + solve(i + 2, cost);
        return dp[i] = Math.min(oneStep, twoStep);
    }
}