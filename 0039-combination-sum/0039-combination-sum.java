class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        fun(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    void fun(int[] arr, int target, int index,
             List<Integer> temp, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if (index == arr.length || target < 0) {
            return;
        }

        // Take
        temp.add(arr[index]);
        fun(arr, target - arr[index], index, temp, ans);

        // Backtrack
        temp.remove(temp.size() - 1);

        // Not Take
        fun(arr, target, index + 1, temp, ans);
    }
}