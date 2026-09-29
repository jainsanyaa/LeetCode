class Solution {
    public int maxVowels(String s, int k) {
        int low= 0;
        int high = k-1;
        int count =0;
        for(int i = low; i<= high;i++){
           if(isVowel(s.charAt(i))){
            count++;
           }
        }
        int maxCount = count;
            while(high < s.length()-1){
if(isVowel(s.charAt(low))){
    count--;
}
    low++;
    high++;
    if(isVowel(s.charAt(high))){
        count++;
    }
    maxCount = Math.max(maxCount,count);
}
return maxCount;
            }
            public boolean isVowel(char ch){
                return ch == 'a'||
                ch == 'e'||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }
}