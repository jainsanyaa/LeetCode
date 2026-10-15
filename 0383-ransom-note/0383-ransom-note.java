class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] need = new int[26];
        int[] have = new int[26];

        for (int i = 0; i < ransomNote.length(); i++) {
            need[ransomNote.charAt(i) - 'a']++;
        }

        for (int i = 0; i < magazine.length(); i++) {
            have[magazine.charAt(i) - 'a']++;
        }

        return check(have, need);
    }

    public boolean check(int[] have, int[] need) {
        for (int i = 0; i < 26; i++) {
            if (have[i] < need[i]) {
                return false;
            }
        }

        return true;
    }
}