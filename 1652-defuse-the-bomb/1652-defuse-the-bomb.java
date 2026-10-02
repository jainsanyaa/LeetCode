class Solution {
    public int[] decrypt(int[] code, int k) {
          int n = code.length;
           int[] ans = new int[n];
            if(k == 0){
             return ans;
            }
        int left;
        int right;
        if(k > 0){
            left = 1;
            right = k;
        }
        else{
            k = -k;
            left = n - k;
            right = n - 1;
        }
        int sum = 0;
        for(int i = left; i <= right; i++){
            sum += code[i % n];
        }
        for(int i = 0; i < n; i++){
            ans[i] = sum;
               sum -= code[left % n];
            left++;
            right++;
            sum += code[right % n];
        }
        return ans;
    }
}