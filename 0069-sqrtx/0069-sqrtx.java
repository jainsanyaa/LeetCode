class Solution {
    public int mySqrt(int x) {
//         int ans = 0;
//         for (int i = 1; (long) i * i <= x; i++) {
//             ans = i;
//         }
//         return ans;
//     }
// }
int low = 1;
 int high = x;
  int ans = 0;
  while(low<=high){
    int mid = low + (high - low) / 2;
     if((long)mid * mid <= x) {
        ans = mid;
        low = mid+1;
    }
    else{
        high = mid-1;
    }
  }
    return ans;
    }
}