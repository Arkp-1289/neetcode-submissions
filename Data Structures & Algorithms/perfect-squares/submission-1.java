class Solution {

    public int solve(int num,int sqrt,int n,int[][] dp){

        if (n==0){return 0;}

        if (n<0 || num>sqrt){return Integer.MAX_VALUE;}

        if (dp[num][n]!=-1){return dp[num][n];}


        int pick = solve (num,sqrt,n-(num*num),dp);
            if (pick!=Integer.MAX_VALUE){
                pick+=1;
        }

        int npick = solve(num+1,sqrt,n,dp);
        dp[num][n]=Math.min(pick,npick);;

        return Math.min(pick,npick);

    }

    public int numSquares(int n) {
        int sq=(int) Math.ceil(Math.sqrt(n));
        int[][] dp = new int[sq+1][n+1];
        for (int i=0;i<sq+1;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(1,sq,n,dp);
    }
}