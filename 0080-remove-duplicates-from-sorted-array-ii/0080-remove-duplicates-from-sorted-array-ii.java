class Solution {
    public int removeDuplicates(int[] nums) {
        int [] arr = new int[nums.length];
        int k = 0;
        for(int i = 0;i<nums.length;i++){
          if(i < 2 || nums[i] != nums[i - 2]) {
                arr[k] = nums[i];
                k++;
            }
        }
        for(int i = 0;  i <k;i++){
            nums[i] = arr[i];
        }
        return k;

        
    }
}