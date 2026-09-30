import java.util.*;

class Solution { 
    public boolean checkInclusion(String s1, String s2) { 
        int k = s1.length(); 
        int[] s1Count = new int[26]; 
        int[] windowCount = new int[26]; 
        for(int i=0;i<s1.length();i++){ 
            s1Count[s1.charAt(i)-'a']++; 
        } 
        int left = 0; 
        for(int right =0;right<s2.length(); right++){ 
           windowCount[s2.charAt(right) - 'a']++; 
            if(right-left+1 == k){ 
                if (Arrays.equals(s1Count, windowCount)) { 
                    return true; 
                } 
                windowCount[s2.charAt(left) - 'a']--; 
                left++; 
            } 
        } 
        return false; 

         
    } 
}