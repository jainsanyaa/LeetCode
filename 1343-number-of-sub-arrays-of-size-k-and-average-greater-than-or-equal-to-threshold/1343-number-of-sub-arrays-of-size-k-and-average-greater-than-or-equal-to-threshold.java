class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
//         int sum = 0;
//         int count = 0;
//         int target = k * threshold;
//         for (int i = 0; i < k; i++) {
//             sum += arr[i];
//         }
//         if (sum >= target) {
//             count++;
//         }
//         for (int i = k; i < arr.length; i++) {
//             sum = sum - arr[i - k] + arr[i];
//             if (sum >= target) {
//                 count++;
//             }
//         }
//         return count;
//     }
// }
int left=0;
int sum =0;
int count=0;
int target = k*threshold;
for(int right=0;right<arr.length;right++){
    sum+=arr[right];
    if(right-left+1==k){
        if(sum>=target){
            count++;
        }
        sum-=arr[left];
        left++;
    }
}
return count;
    }
}
