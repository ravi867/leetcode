class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        ArrayList<Integer>[] dp = (ArrayList<Integer>[]) new ArrayList[n];
        for (int i = 0; i < n; i++) {
            dp[i] = new ArrayList<>();
        }
        dp[n-1].add(nums[n-1]);
        List<Integer> longestList = dp[n-1];
        for (int i = n-2; i >= 0; i--) {
            int maxIndex = n;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] % nums[i] == 0 && (maxIndex == n || dp[j].size() > dp[maxIndex].size()))  {
                    maxIndex = j;
                }
            }
            dp[i] = new ArrayList<>();
            dp[i].add(nums[i]);
            if (maxIndex != n) {
                for (int dpNum: dp[maxIndex]) {
                    dp[i].add(dpNum);
                }
            }
            if (longestList.size() < dp[i].size()) {
                longestList = dp[i];
            }
        }
        return longestList;
    }
}