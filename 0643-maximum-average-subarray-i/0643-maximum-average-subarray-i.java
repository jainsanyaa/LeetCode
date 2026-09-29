class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for(int right=0;right<nums.length;right++){
            sum += nums[right];
            if(right -left+1 == k){
                ans = Math.max(ans,sum);
                sum -= nums[left];
                left++;
            }
        }
        return (double) ans/k;
    }
}
//         int sum = 0;
//         for(int i = 0; i < k; i++) {
//             sum += nums[i];
//         }
//         int maxSum = sum;
//         for(int i = k; i < nums.length; i++) {
//             sum = sum - nums[i - k] + nums[i];
//             maxSum = Math.max(maxSum, sum);
//         }
//         return (double) maxSum / k;
//     }
// }