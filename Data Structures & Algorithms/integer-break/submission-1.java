class Solution {

    public int solve(int num,int n, int target,int[][] dp){

        if (num>n){return 0;}
        if (target==0){return 1;}
        if (target<0){return 0;}
        if (dp[num][target]!=-1){return dp[num][target];}
        // System.out.println(num);
        int pick = num*(solve(num,n,target-num,dp));
        int npick = solve(num+1,n,target,dp);
        dp[num][target]=Math.max(pick,npick);;
        return Math.max(pick,npick);
    }

    public int integerBreak(int n) {
        int[][] dp = new int[n+1][n+1];
        for (int i=1;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(1,n-1,n,dp);
        
    }
}