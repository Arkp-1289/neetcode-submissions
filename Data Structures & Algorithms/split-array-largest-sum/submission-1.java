public class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int[][] dp = new int[n][k+1];
        for (int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return dfs(nums, 0, k, n,dp);
    }

    private int dfs(int[] nums, int i, int m, int n,int[][] dp) {
        if (i == n) {
            return m == 0 ? 0 : Integer.MAX_VALUE;
        }
        if (m == 0) {
            return Integer.MAX_VALUE;
        }

        if (dp[i][m]!=-1){return dp[i][m];}

        int res = Integer.MAX_VALUE;
        int curSum = 0;
        for (int j = i; j < n; j++) {
            curSum += nums[j];
            res = Math.min(res, Math.max(curSum, dfs(nums, j + 1, m - 1, n,dp)));
        }
        dp[i][m]=res;
        return res;
    }
}