class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        generate(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    public void generate(int[] nums, int index, List<Integer> current, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            generate(nums, i + 1, current, ans);
            current.remove(current.size() - 1);
        }
    }
}