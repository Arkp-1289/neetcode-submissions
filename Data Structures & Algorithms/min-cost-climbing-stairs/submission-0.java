class Solution {

    public int solve(int ind, int[] cost ,int[] dp){

        if (ind>=cost.length){return 0;}

        if (dp[ind]!=-1){return dp[ind];}


        int one=cost[ind]+solve(ind+1,cost,dp);
        int two=cost[ind]+solve(ind+2,cost,dp);
        dp[ind]=Math.min(one,two);
        return dp[ind];
    }


    public int minCostClimbingStairs(int[] cost) {
        
        int n=cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(solve(0,cost,dp),solve(1,cost,dp));

        
    }
}
