class Solution {

    public int solve(int i,int j , int[] piles,int[][] dp){

        if (i>=piles.length || j<0){return 0;}
        if (i==j){return piles[i];}
        if (dp[i][j]!=Integer.MIN_VALUE){return dp[i][j];}

        int first = piles[i]-solve(i+1,j,piles,dp);
        int last= piles[j]-solve(i,j-1,piles,dp);
        dp[i][j]=Math.max(first,last);

        return Math.max(first,last);
    }


    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        int[][] dp = new int[n][n];
        for (int i=0;i<n;i++){
            Arrays.fill(dp[i],Integer.MIN_VALUE);
        }
        int res= solve(0,n-1,piles,dp);
        if (res>=0){return true;}
        return false;
        
    }
}