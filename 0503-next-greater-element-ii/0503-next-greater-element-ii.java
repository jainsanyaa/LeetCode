class Solution{
    public int[] nextGreaterElements(int[] nums){
        int n=nums.length;
        int res[]=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            res[i]=-1;
        }
        for(int i=0;i<2*n;i++){
            int index=i%n;//  circualar array traverse karne mai help karta 
            while(!st.isEmpty()&&nums[st.peek()]<nums[index]){
                int preIndex=st.pop();
                res[preIndex]=nums[index];
            }
            if(i<n){// 2 barr traverse ho rha but store 1 hi ho rha hai traverse
                st.push(index);
            }
        }
        return res;
    }
}