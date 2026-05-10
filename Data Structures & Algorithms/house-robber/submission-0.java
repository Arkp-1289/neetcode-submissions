class Solution {

    public int solve(int ind,int n,int[] nums,int[] dp){

        if (ind>=n){return 0;}

        if (dp[ind]!=-1){return dp[ind];}

        int take =nums[ind]+solve(ind+2,n,nums,dp);
        int n_take =solve(ind+1,n,nums,dp);
        dp[ind]=Math.max(take,n_take);
        return dp[ind];
    }


    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(0,n,nums,dp);
        
    }
}
