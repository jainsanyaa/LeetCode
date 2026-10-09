class Solution{
    public String simplifyPath(String path){
        Stack<String> st=new Stack<>();
        String[] arr=path.split("/");
        for(String str:arr){
            if(str.equals("")||str.equals(".")){
                continue;
            }
            else if(str.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(str);
            }
        }
        StringBuilder ans=new StringBuilder();
        for(String str:st){
            ans.append("/");
            ans.append(str);
        }
        if(ans.length()==0){
            return "/";
        }
        return ans.toString();
    }
}