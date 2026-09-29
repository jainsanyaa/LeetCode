class Solution {
    public int maxVowels(String s, int k) {
//         int low= 0;
//         int high = k-1;
//         int count =0;
//         for(int i = low; i<= high;i++){
//            if(isVowel(s.charAt(i))){
//             count++;
//            }
//         }
//         int maxCount = count;
//             while(high < s.length()-1){
// if(isVowel(s.charAt(low))){
//     count--;
// }
//     low++;
//     high++;
//     if(isVowel(s.charAt(high))){
//         count++;
//     }
//     maxCount = Math.max(maxCount,count);
// }
// return maxCount;
//             }
int left = 0;
int count=0;
int ans=0;
for(int right=0;right<s.length();right++){
    if(isVowel(s.charAt(right))){
        count++;
    }
    if(right-left+1==k){
        ans = Math.max(ans,count);
        if(isVowel(s.charAt(left))){
            count--;
        }
        left++;

    }
}

return ans;
    }
  public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u';
    }
}
