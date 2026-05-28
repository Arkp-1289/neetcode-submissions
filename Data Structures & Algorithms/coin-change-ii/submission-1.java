class Solution {
    int[][] dp ;
    public int solve(int ind, int amount,int n, int[] coins){
        if (amount<0 || ind>=n){return 0;}
        if (amount==0){return 1;}
        if (dp[ind][amount]!=-1){return dp[ind][amount];}

        int pick=solve(ind,amount-coins[ind],n,coins);
        int npick=solve(ind+1,amount,n,coins);
        dp[ind][amount]=pick+npick;
        return pick+npick;
    }
    
    public int change(int amount, int[] coins) {
        int n=coins.length;
        dp = new int[n][amount+1];
        for (int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,amount,n,coins);
        
    }
}
