class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer>st = new Stack<>();
        for(int i = 0; i < n;i++){
           while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i]){
                int preIndex = st.pop();
                ans[preIndex] = i-preIndex;

            }
            st.push(i);
        }
        return ans;
    }
    }