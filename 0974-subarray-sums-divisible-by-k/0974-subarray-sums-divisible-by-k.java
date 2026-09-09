class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0;
        int res =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        // remainder phle sai 1 bar  aya hua hai
        map.put(0,1);
        for(int i =0; i<nums.length;i++){
            sum += nums[i];
            int rem = sum%k;
            // negative sum ko positive
            if(rem < 0){
                rem = rem+k;
            }
                 // Agar same remainder pehle aa chuka hai
            // toh utne subarrays divisible by k hain
            if (map.containsKey(rem)) {
                res += map.get(rem);
            }     
         // remainder ki frequency increase karo
         map.put(rem,map.getOrDefault(rem,0) +1);
        }  
        return res;
    }
}