class Solution {

    public int solve(int i,int j , int n, int m, int[][] grid,int[][] dp){

        if (i>=n || j>=m){return 0;}
        if (grid[i][j]==1){return 0;}

        if (i==n-1 && j==m-1){return 1;}
        if (dp[i][j]!=-1){return dp[i][j];}

        int right = solve(i+1,j,n,m,grid,dp);
        int down = solve(i,j+1,n,m,grid,dp);
        dp[i][j]=right+down;

        return right+down;

    }


    public int uniquePathsWithObstacles(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int[][] dp = new int[n][m];
        for (int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,0,n,m,grid,dp);
        
    }
}