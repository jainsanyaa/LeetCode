class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(st.isEmpty()){
                st.push(new int[] {c,1});
            }
            else if(st.peek()[0]==c){
                st.peek()[1]++;
                if(st.peek()[1]==k){
                    st.pop();
                }

            }else{
                st.push(new int[]{c,1});
            }
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            int [] pair = st.pop();
            for(int i = 0; i < pair[1];i++){
                res.append((char) pair[0]);
            }
        }
         return res.reverse().toString();
        
    }
}