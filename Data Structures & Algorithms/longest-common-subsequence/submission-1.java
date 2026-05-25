class Solution {

    public int solve(int i, int j , int n , int m , String t1, String t2,int[][] dp)
    {
        if (i>=n || j>=m){return 0;}
        if(dp[i][j]!=-1){return dp[i][j];}

        int res1=0,res2=0;
        if  (t1.charAt(i)==t2.charAt(j)){
            res1=1+solve(i+1,j+1,n,m,t1,t2,dp);
        } else{
            int first = solve(i+1,j,n,m,t1,t2,dp);
            int second = solve(i,j+1,n,m,t1,t2,dp);
            res2=Math.max(first,second);
        }
        dp[i][j]=Math.max(res1,res2);

        return Math.max(res1,res2);



    }


    public int longestCommonSubsequence(String t1, String t2) {
        
        int n=t1.length(),m=t2.length();
        int[][] dp = new int[n][m];
        for (int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,0,n,m,t1,t2,dp);
    }
}
