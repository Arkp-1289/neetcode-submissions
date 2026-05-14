class Solution {


    public int solve(int ind,int n,int amount,int[] coins,int[][] dp){

        if (amount==0){return 0;}
        if (amount<0 || ind>=n){return Integer.MAX_VALUE;}
        if (dp[ind][amount]!=-1){return dp[ind][amount];}
        
        int same =solve(ind,n,amount-coins[ind],coins,dp);
        if (same!=Integer.MAX_VALUE){
            same+=1;
        }
        int next = solve(ind+1,n,amount,coins,dp);
        dp[ind][amount]=Math.min(same,next);
        return Math.min(same,next);
    }


    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp = new int[n][amount+1];
        for (int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int res= solve(0,n,amount,coins,dp);
        
        return res!=Integer.MAX_VALUE?res:-1;
        
    }
}
