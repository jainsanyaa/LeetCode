class Solution {
    public int rob(int[] nums) {
        if(nums.length <= 1) return nums[0];
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return loot(0, nums, dp);
    }
    public int loot(int i, int[] nums, int[] dp) {
        if(i >= nums.length) return 0;
        if(dp[i] != -1) return dp[i];

        int pick = nums[i] + loot(i + 2, nums, dp);
        int skip = loot(i + 1, nums, dp);

        return dp[i] = Math.max(pick, skip);
    }
}