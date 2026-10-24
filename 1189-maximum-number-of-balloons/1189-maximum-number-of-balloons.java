class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> have = new HashMap<>();
        for(char c : text.toCharArray()) {
            have.put(c, have.getOrDefault(c, 0) + 1);
        }
        HashMap<Character, Integer> need = new HashMap<>();
        need.put('b', 1);
        need.put('a', 1);
        need.put('l', 2);
        need.put('o', 2);
        need.put('n', 1);
        int res = Integer.MAX_VALUE;
        for(char c : need.keySet()) {
            int freq = have.getOrDefault(c, 0);
            int required = need.get(c);
            int times = freq / required;
            res = Math.min(res, times);
        }
        return res;
    }
}