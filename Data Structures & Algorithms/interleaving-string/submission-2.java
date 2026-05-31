class Solution {
    int[][] dp;

    public boolean solve(int i,int j, int k, String s1,String s2,String s3){
        int n=s1.length(),m=s2.length(),l=s3.length();
        if (i==n && j==m && k==l){return true;}
        if (i>n || j>m || k>=l){return false;}
        if (dp[i][j]!=-1){
            return dp[i][j]==1?true:false;
        }
        boolean ans=false;
        if(i<n && s1.charAt(i)==s3.charAt(k)){
            ans=ans || solve(i+1,j,k+1,s1,s2,s3);
        }
        if (j<m && s2.charAt(j)==s3.charAt(k)){
            ans=ans || solve(i,j+1,k+1,s1,s2,s3);
        }
        dp[i][j]=ans?1:0;

        return ans;
    }


    public boolean isInterleave(String s1, String s2, String s3) {
        int n=s1.length(),m=s2.length(),l=s3.length();
        dp = new int[n+1][m+1];
        for (int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,0,0,s1,s2,s3);
    }
}
